# EmployeeManagement - Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### How to build
```
./mvnw clean install
```

### How to run
```
./mvnw clean spring-boot:run
```

### How to test
```
curl -v localhost:8080/employees | json_pp
curl -v localhost:8080/employees/99 | json_pp
curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"firstName": "Samwise", "lastName": "Gamgee", "email": "sam@warner.com", "role": "gardener", "salary": "10000"}' | json_pp
curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"firstName": "Samwise", "lastName": "Gamgee", "email": "sam@warner.com", "role": "ring bearer", "salary": "10000"}' | json_pp
curl -X DELETE localhost:8080/employees/3 | json_pp
```

### Docker

* [Spring Boot Docker](https://spring.io/guides/topicals/spring-boot-docker/)
```
docker build -t example/employee-management .
docker run -p 8080:8080 example/employee-management
```

Or with Docker Compose:

```
docker-compose down
docker rmi example/employee-management:latest
docker-compose up
```

https://github.com/SafdarJamal/crud-app/blob/master/src/data/index.js

https://aws.plainenglish.io/what-is-kubernetes-k8s-and-main-kubernetes-components-1-50919e5fd066