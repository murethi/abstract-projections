# Abstract projections

### Scope
This repo will handle dynamic projections using spring data
JPA and how to use abstraction as projections for immutability of DTO objects.

### Requirements
* Docker

### How to run
You can clone this repo,build an image and run it using docker.
I have used the Jib maven plugin to build the docker image. Here is a linked to the
Jib maven plugin</br>
* https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin

To build an image using Jib run the following command

````
mvn compile jib:dockerBuild
````
This will build an image named **murethi/abstract-projections**.
You can change the image name by editing the ````pom.xml```` file. <br>

You can now run the application on docker using the following command

````
docker compose up
````

The application will run on ````http://localhost:8080 ```` and database on
````http://localhost:3309 ````

### Routes

* GET /products (List all products)
* POST /products/create (Create product)
