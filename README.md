# Banking Application

## Overview

This project is built using Spring Boot with MySQL as the database, leveraging Spring Data JPA, Spring MVC, and Lombok,
running on Java SDK version 21. It provides RESTful APIs for managing accounts.

## Table of Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Technologies Used](#technologies-used)

## Getting Started

### Prerequisites

- Java SDK 21
- Maven or Gradle
- MySQL Database
- An IDE such as IntelliJ IDEA 2024.2.4 Ultimate Edition

### Installation

1. Clone the repository:
    ```sh
    git clone <https://github.com/Oliver9579/Banking-Application.git>
    ```
2. Navigate to the project directory:
    ```sh
    cd <Banking_Application>
    ```

3. Configure the database connection in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_db_username
    spring.datasource.password=your_db_password
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    ```
4. Build the project using Maven or Gradle:
    ```sh
    mvn clean install
    ```
   Or if you're using Gradle:
    ```sh
    ./gradlew build
    ```
5. Run the application:
    ```sh
    mvn spring-boot:run
    ```
   Or using Gradle:
    ```sh
    ./gradlew bootRun
    ```

## Endpoints

### Product API

- **Create Account**
    - **URL:** `/api/accounts`
    - **Method:** `POST`
    - **Request Body:**
        ```json
        {
          "accountHolderName": "John Doe",
          "balance": 10000
        }
        ```
    - **Response:**
        ```json
        {
          "id": 1,
          "accountHolderName": "John Doe",
          "balance": 10000
        }
        ```

- **Get Account by ID**
    - **URL:** `/api/accounts/{id}`
    - **Method:** `GET`
    - **Response:**
        ```json
        {
          "id": 1,
          "accountHolderName": "John Doe",
          "balance": 10000
        }
        ```

- **Add deposit**
    - **URL:** `api/accounts/{id}/deposit`
    - **Method:** `PUT`
    - **Request Body:**
        ```json
        {
          "amount": 5000
        }
        ```
    - **Response:**
        ```json
        {
          "id": 1,
          "accountHolderName": "John Doe",
          "balance": 15000
        }
        ```

- **Get Product by ID**
    - **URL:** `api/accounts/{id}/withdraw`
    - **Method:** `PUT`
    - **Response:**
        ```json
        {
          "amount": 5000
        }
        ```
        - **Response:**
          ```json
          {
            "id": 1,
            "accountHolderName": "John Doe",
            "balance": 10000
          }
          ```

- **Get Account by ID**
    - **URL:** `/api/accounts`
    - **Method:** `GET`
      - **Response:**
          ```json
          [
            {
                "id": 1,
                "accountHolderName": "John Doe",
                "balance": 20000.0
            },
            {
                "id": 3,
                "accountHolderName": "John Doe2",
                "balance": 5000.0
            },
            {
                "id": 4,
                "accountHolderName": "John Doe3",
                "balance": 10000.0
            }
        ]
        ```
  
- **Delete Account by id**
    - **URL:** `/api/accounts/{id}`
    - **Method:** `DELETE`
      - **Response:**
          "Account is deleted successfully!"

## Technologies Used

- **Java SDK 21**
- **Spring Boot**
- **Spring Data JPA**
- **Spring MVC**
- **Lombok**
- **MySQL**