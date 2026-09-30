# Full-Stack Java + MVC + Database + Node + Frontend Application

A complete Task Management application with:

- Backend: Java 17 + Spring Boot + Spring MVC + Spring Data JPA
- Database: MySQL 8
- Frontend: React + Vite + Node.js
- REST API: CRUD operations for tasks
- Validation and error handling
- CORS configuration
- SQL schema
- Docker Compose for MySQL
- Maven wrapper-style setup notes
- Environment configuration examples

## Project structure

fullstack-java-node-app/
├── backend/
│   ├── pom.xml
│   ├── src/main/java/com/example/taskapp/
│   │   ├── TaskApplication.java
│   │   ├── config/WebConfig.java
│   │   ├── controller/TaskController.java
│   │   ├── entity/Task.java
│   │   ├── exception/GlobalExceptionHandler.java
│   │   ├── repository/TaskRepository.java
│   │   └── service/TaskService.java
│   └── src/main/resources/
│       ├── application.properties
│       └── schema.sql
├── frontend/
│   ├── package.json
│   ├── vite.config.js
│   ├── index.html
│   └── src/
│       ├── main.jsx
│       ├── App.jsx
│       ├── api.js
│       └── styles.css
├── database/
│   └── init.sql
├── docker-compose.yml
└── .gitignore

## Requirements

Install:

- JDK 17+
- Maven 3.9+ (or use an IDE with Maven support)
- Node.js 20+
- npm
- Docker Desktop (optional, but recommended for MySQL)

## 1. Start MySQL with Docker

From the project root:

    docker compose up -d mysql

The database will be created automatically:

- Database: taskdb
- Username: taskuser
- Password: taskpass
- MySQL port: 3306

## 2. Start the backend

Open a terminal:

    cd backend
    mvn spring-boot:run

Backend API:

    http://localhost:8080/api/tasks

## 3. Start the frontend

Open another terminal:

    cd frontend
    npm install
    npm run dev

Open:

    http://localhost:5173

## API endpoints

GET    /api/tasks
GET    /api/tasks/{id}
POST   /api/tasks
PUT    /api/tasks/{id}
DELETE /api/tasks/{id}

Example POST:

{
  "title": "Build Java application",
  "description": "Complete the backend API",
  "status": "TODO"
}

Allowed status values:

- TODO
- IN_PROGRESS
- DONE

## Database without Docker

Create a MySQL database manually:

    CREATE DATABASE taskdb;

Then update backend/src/main/resources/application.properties if your
username/password are different.

## Notes

This is intentionally structured as a clean starter application that can
be extended with login/JWT, roles, pagination, search, file uploads,
Spring Security, PostgreSQL, deployment, etc.
