# mix-hr

A comprehensive Human Resources management system built with Spring Boot, based on the OFBiz data model.

## Overview

The `mix-hr` module provides a robust backend for managing core HR functions. It is designed to be a scalable, modular component of the larger "mix modules" ecosystem.

## Modules

The application covers the full HR lifecycle with the following integrated modules:

### 1. Core & Parties
*   **Party Management**: Manage Organizations and Persons (Employees).
*   **Foundation**: Base entities for all actors in the system.

### 2. Employment
*   **Employments**: Track employment relationships (Hiring, Termination).
*   **Positions**: Manage Job Positions (`EmplPosition`) and their definitions.
*   **Structure**: Define organizational hierarchy and budget assignments.

### 3. Skills & Qualifications
*   **Skill Tracking**: Manage employee skills (`PartySkill`) and skill types.
*   **Ratings**: Track years of experience and skill levels.

### 4. Compensation & Benefits
*   **Pay Grades**: Define salary structures and steps (`SalaryStep`).
*   **History**: Track salary history (`PayHistory`) over time.
*   **Benefits**: Assign and manage benefits like Health Insurance, PTO (`EmploymentBenefit`).

### 5. Leave Management
*   **Leave Requests**: Manage employee leave applications (`EmplLeave`).
*   **Approvals**: Workflow for leave approval.

### 6. Training & Performance
*   **Training**: Schedule and track training classes and attendance (`PersonTraining`).
*   **Performance Reviews**: Comprehensive review system with detailed line items and ratings (`PerfReview`).

### 7. Termination
*   **Exit Management**: Standardized termination types and reasons.

## Technology Stack

*   **Java 17**
*   **Spring Boot 3.2.0**
*   **Spring Data JPA** (Hibernate)
*   **H2 Database** (In-Memory for Dev/Test)
*   **MapStruct** (Efficient DTO Mapping)
*   **Lombok** (Boilerplate reduction)
*   **Spring Security** (Basic Auth & H2 Console Access)

## API Endpoints

The API is accessible at `http://localhost:8080/api/`. Key endpoints include:

*   `/api/parties/*`
*   `/api/employments/*`
*   `/api/positions/*`
*   `/api/skills/*`
*   `/api/leaves/*`
*   `/api/compensation/*`
*   `/api/performance/*`
*   `/api/termination/*`

## Getting Started

### Prerequisites
*   JDK 17+
*   Maven 3.x

### Running the Application

```bash
mvn spring-boot:run
```

### Accessing the Database
The H2 Console is enabled for development:
*   **URL**: `http://localhost:8080/h2-console`
*   **JDBC URL**: `jdbc:h2:mem:hrdb`
*   **User**: `sa`
*   **Password**: `password`
