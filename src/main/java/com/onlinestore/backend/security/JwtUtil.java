package com.onlinestore.backend.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtil {
	
	private final SecretKey key = Keys.hmacShaKeyFor("this-is-a-very-long-secret-key-for-jwt-signing-1234".getBytes());
	private final long expirationMs = 1000*60*60*10; 
	
	public String generateToken(String username) {
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+expirationMs))
				.signWith(key)
				.compact();
	}
	public String extractUsername(String token) {
		return Jwts.parserBuilder().setSigningKey(key).build()
				.parseClaimsJws(token).getBody().getSubject();
	}
	public boolean validateToken(String token) {
		try {
			Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
			return true;
		}catch (JwtException | IllegalArgumentException e) {
			return false;
		}
	}
}
