# Online Store — Backend

REST API backend for a full-stack e-commerce application, built with Spring Boot and MySQL. Handles product data and order processing for the [Angular frontend](https://github.com/sindhujaganesan1726-bit/online-store-frontend).

## Features

- Product catalog API (list all products, get product by ID)
- Order placement API — saves customer orders (with items and totals) to the database
- Layered architecture: Controller → Service → Repository → Entity
- Sample product data seeded automatically on startup
- Database credentials managed via environment variables (not hardcoded)

## Tech Stack

- **Java** with **Spring Boot**
- **Spring Data JPA** (Hibernate) for database access
- **MySQL** for persistence
- **Maven** for build and dependency management
- **Lombok** to reduce boilerplate

## API Endpoints

| Method | Endpoint              | Description                  |
|--------|-----------------------|-------------------------------|
| GET    | `/api/products`       | Get all products              |
| GET    | `/api/products/{id}`  | Get a single product by ID    |
| POST   | `/api/orders`         | Place a new order              |

## Getting Started

### Prerequisites
- Java JDK installed
- MySQL installed and running
- Maven (or use the included `mvnw` wrapper)

### Setup

1. Clone the repo:
   ```
   git clone https://github.com/sindhujaganesan1726-bit/online-store-backend.git
   ```

2. Create a MySQL database named `onlinestore`.

3. Set the following environment variables with your MySQL credentials:
   - `DB_USERNAME`
   - `DB_PASSWORD`

4. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

5. The API will be available at `http://localhost:8080`.

On first run, the app automatically seeds a few sample products into the database.

## Project Structure

```
src/main/java/com/onlinestore/backend/
├── controller/     # REST endpoints
├── service/        # Business logic
├── repository/     # Data access (Spring Data JPA)
└── entity/         # JPA entities (Product, Order)
```

## Related Repo

Frontend (Angular): [online-store-frontend](https://github.com/sindhujaganesan1726-bit/online-store-frontend)

## Author

Sindhu — Java Full Stack Developer
