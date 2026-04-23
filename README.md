# User Management API

## 🚀 Overview

A RESTful backend application built using Spring Boot that allows managing users with full CRUD operations. This project demonstrates clean architecture, validation, and proper exception handling.

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* MySQL
* Spring Data JPA
* Hibernate

---

## 📌 Features

* Create User
* Get All Users
* Get User by ID
* Update User
* Delete User
* Input Validation
* Global Exception Handling
* DTO Pattern (Separation of concerns)
* Logging using SLF4J

---

## 📂 Project Structure

controller → Handles API requests
service → Business logic
repository → Database interaction
entity → Database model
dto → API request/response model
exception → Global error handling

---

## 🔗 API Endpoints

POST /users
GET /users
GET /users/{id}
PUT /users/{id}
DELETE /users/{id}

---

## ▶️ How to Run

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the application using `DemoApplication`
4. Test APIs using Postman

---

## 🧪 Sample Request

POST /users

{
"name": "Abhinav",
"email": "[abhinav@test.com](mailto:abhinav@test.com)"
}

---

## 📈 Future Improvements

* Add Pagination & Sorting
* Implement JWT Authentication
* Add Swagger for API documentation

---

## 💡 What I Learned

* Building REST APIs using Spring Boot
* Working with MySQL and JPA
* Implementing layered architecture
* Handling validation and exceptions properly
