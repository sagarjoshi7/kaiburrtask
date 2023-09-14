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
