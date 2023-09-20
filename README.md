# KaiburrTask

Java Servlet Programs

This repository contains Java Servlet programs for the Kaiburr Assessment 2022.

Task 1: Java REST API example

This program implements a REST API with endpoints for searching, creating, and deleting "server" objects.

Endpoints:

GET servers
Returns all servers if no parameters are passed.
Returns a single server or 404 if there is no such server when a server ID is passed as a parameter.
PUT a server
The server object is passed as a JSON-encoded message body.
Creates a new server if it does not exist, or updates an existing server.
DELETE a server
The parameter is a server ID.
Deletes the server if it exists.
GET (find) servers by name
The parameter is a string.
Returns one or more servers whose name contains the given string.
Returns 404 if no servers are found.
Server objects are stored in a MongoDB database.

To run the program:

Clone the repository to your local machine.
Build the program using Maven:
mvn clean install
Start the Tomcat server.
Open a web browser and navigate to the following URL:
http://localhost:8080/KaiburrTask/servers
You should see a list of all the servers in the database.

To test the endpoints:

You can use a tool like Postman to test the endpoints. Here are some examples:

GET servers
GET http://localhost:8080/KaiburrTask/servers
This will return a list of all the servers in the database.

GET a server by ID
GET http://localhost:8080/KaiburrTask/servers/123
This will return the server with the ID 123.

PUT a server
PUT http://localhost:8080/KaiburrTask/servers
Content-Type: application/json

{
  "name": "my centos server",
  "id": "123",
  "language": "java",
  "framework": "django"
}
This will create a new server with the given ID, or update an existing server with the given ID.

DELETE a server
DELETE http://localhost:8080/KaiburrTask/servers/123
This will delete the server with the ID 123.

GET servers by name
GET http://localhost:8080/KaiburrTask/servers?name=centos
This will return all the servers whose name contains the string "centos".
Certainly, adding a `README.md` file to your GitHub repository is a good practice to provide documentation and instructions for users and collaborators. Here's a sample `README.md` file for your project:

```markdown
# Server Management Application

This is a sample project for creating and managing server objects using a REST API built with Java Spring Boot and MongoDB. It also includes a basic web UI for interacting with the API.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Running the Application](#running-the-application)
  - [Testing](#testing)
- [Continuous Integration and Continuous Deployment](#continuous-integration-and-continuous-deployment)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK)
- MongoDB installed and running
- Maven or Gradle (for dependency management)
- Git

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/server-management-app.git
   ```

2. Navigate to the project directory:

   ```bash
   cd server-management-app
   ```

3. Build the project:

   ```bash
   mvn clean install
   ```

## Usage

### Running the Application

1. Ensure MongoDB is running.

2. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

   The application will be accessible at `http://localhost:8080`.

### Testing

You can use tools like Postman, cURL, or the provided web UI to interact with the API endpoints. Here are some sample requests:

- **GET all servers:** `GET http://localhost:8080/servers`
- **GET a server by ID:** `GET http://localhost:8080/servers/{id}`
- **PUT a server:** `PUT http://localhost:8080/servers` with JSON body
- **DELETE a server:** `DELETE http://localhost:8080/servers/{id}`
- **GET servers by name:** `GET http://localhost:8080/servers/findByName?name={name}`

### Continuous Integration and Continuous Deployment

This project includes a GitHub Actions CI/CD pipeline. The pipeline is triggered on pushes to the `main` branch. It builds and tests the application. You can extend it to include deployment steps to your production environment.

For more details, see the [CI/CD pipeline configuration](.github/workflows/ci-cd.yml).

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with clear messages.
4. Push your changes to your fork.
5. Create a pull request to the `main` branch of this repository.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

In this `README.md`, replace placeholders like `yourusername`, `server-management-app`, and update the content to match your specific project. This README provides information on prerequisites, installation, usage, testing, CI/CD, contributing, and licensing.
