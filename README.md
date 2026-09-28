# Online Store – Backend (Spring Boot REST API)

REST API for a full-stack online store: product catalog, user registration and login with JWT, and order placement.

- **Live site:** https://online-store-frontend-three.vercel.app
- **Live API (products):** https://online-store-backend-w09x.onrender.com/api/products
- **Frontend repo:** https://github.com/sindhujaganesan1726-bit/online-store-frontend

> The backend and database run on free hosting tiers, so the first request after a period of inactivity can take up to about a minute while the server wakes up.

## Tech Stack

- Java, Spring Boot
- Spring Security with stateless JWT authentication and BCrypt password hashing
- Spring Data JPA / Hibernate
- MySQL (hosted on Railway)
- Maven (wrapper included), Docker
- Deployed on Render

## Features

- User registration and login; passwords are hashed with BCrypt
- Login returns a JWT that the frontend stores and sends with requests
- Custom JWT filter and stateless security configuration
- Public product listing
- Order endpoints for checkout
- CORS configured for the local frontend and the deployed Vercel site

## API Endpoints

| Method | Endpoint | Description | Access |
|--------|----------|-------------|--------|
| POST | `/api/auth/register` | Create a new account | Public |
| POST | `/api/auth/login` | Log in, returns a JWT | Public |
| GET | `/api/products` | List all products | Public |
| — | `/api/orders/**` | Place and manage orders | Public |

<!-- TODO: add any other endpoints you have (product by id, create order, etc.) -->

## Project Structure

```
src/main/java/com/onlinestore/backend
├── controller   # REST controllers (auth, products, orders)
├── entity       # JPA entities (User, Product, Order)
├── repository   # Spring Data repositories
└── security     # SecurityConfig, JwtAuthFilter, JwtUtil
```

## Run Locally

**Prerequisites:** JDK (see the version in `pom.xml`) and MySQL.

1. Clone the repo
   ```bash
   git clone https://github.com/sindhujaganesan1726-bit/online-store-backend.git
   cd online-store-backend
   ```
2. Create the database
   ```sql
   CREATE DATABASE onlinestore;
   ```
3. Set your database URL, username and password in `src/main/resources/application.properties` (use environment variables for real credentials, and never commit passwords or secrets).
4. Start the app
   ```bash
   ./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
   ```
5. The API runs at http://localhost:8080. Try http://localhost:8080/api/products

**With Docker**

```bash
docker build -t online-store-backend .
docker run -p 8080:8080 online-store-backend
```

## Deployment

- **Backend:** Render (built from the included Dockerfile)
- **Database:** MySQL on Railway
- **Frontend:** Vercel (separate repo)

CORS must allow the frontend origin (`http://localhost:4200` for local work and the Vercel URL in production).

## Author

Sindhu – Java Full Stack Developer
GitHub: [sindhujaganesan1726-bit](https://github.com/sindhujaganesan1726-bit)