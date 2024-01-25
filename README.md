# User Table CRUD Application

This is a simple Spring Boot CRUD (Create, Read, Update, Delete) application for managing user data in a database. The application uses Spring MVC architecture and interacts with a relational database using Spring Data JPA.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)


## Features

- View a list of users
- Add a new user
- Edit an existing user
- Delete a user

## Getting Started

### Prerequisites

Before running the application, make sure you have the following installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL](https://dev.mysql.com/downloads/) (or another relational database)

### Installation

1. Clone the repository:

    ```bash
   git clone https://github.com/ghanghavmayur/Spring-Crud-User-Application.git

3. Navigate to the project directory:
 
    ```bash
    cd UserTableCrudApp
   
4. Update the database configuration:
- Open src/main/resources/application.properties
- Replace your-database-url, your-username, and your-password with your actual database URL, username, and password.

5. Build and run the application:
- The application should now be running at  http://localhost:8080.

# Usage
- Access the application through the web browser at http://localhost:8080. You will find a homepage with links to manage users.

# Endpoints
- GET   /users :  View a list of users.
- GET   /users/new :  Add a new user form.
- POST   /users/save :  Save a new or edited user.
- GET   /users/edit/{id} :  Edit an existing user.
- GET   /users/delete/{id} :  Delete a user.

# Contributing
- Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or create a pull request.
