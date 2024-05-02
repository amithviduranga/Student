# Rest API to save student data into mysql DB

## Introduction

This project is a simple Post Rest API to save student data into mysql implemented using Spring Boot and Hibernate.

## Prerequisites

Before running this application, ensure that you have the following installed on your system:

- Java Development Kit (JDK) 8 or higher
- Maven
- MySQL Server

## Configuration

### Database Configuration

This application uses MySQL database to store student data. Follow these steps to set up the database:

1. Install MySQL Server if not already installed.
2. Create a new database named `studentdb`.
3. Update the database connection properties in `application.properties` file located at `src/main/resources`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
   spring.datasource.username=your_username
   spring.datasource.password=your_password


   
