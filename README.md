# 📦 Spring Boot HATEOAS Example

This project demonstrates how to implement **HATEOAS** (Hypermedia as the Engine of Application State) in a RESTful API using **Spring Boot**.

## 📚 What is HATEOAS?

HATEOAS is a constraint of REST application architecture that keeps your API self-explanatory by including **links** in responses that guide clients on what actions they can take next.

Think of it as your API saying:  
> "Hey, here's your data... and here's what you can do with it."

---

## 🚀 Features

- Create, update, cancel, and view orders
- Smart links based on the order status (e.g., show cancel option only when status is `PROCESSING`)
- HATEOAS-powered responses with relevant action links
- In-memory database using **H2**
- Clean, modular structure using Controller, Service, and Model layers

---

## 🔧 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring HATEOAS
- Spring Data JPA
- H2 Database (in-memory)

---

## 🛠️ How to Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Aman20aug/Hateos.git
   cd Hateos

# Run the application:

## You can run it from your IDE or with:
./mvnw spring-boot:run

## Access H2 Console (Optional):
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
