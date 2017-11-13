# REST API Backend

Project to serve as base to implement a REST API with JWT

## How to use
### How to get a jwt token
First of all, you need to be registered in the DB
```sh
$ curl -H "Content-Type: application/json" -X POST -d '{"username": "admin", "password": "myAdminPassword"}' http://localhost:8080/user/sign-up
```

Then, you can do login to get a token
```sh
$ curl -i -H "Content-Type: application/json" -X POST -d '{"username": "admin", "password": "myAdminPassword"}' http://localhost:8080/login
```

## Technology used
* Java 8
* Spring boot v2.0.0
    * spring-boot-starter-actuator
    * spring-boot-starter-data-jpa
    * spring-boot-starter-security
    * spring-boot-starter-web
* HSQLDB
* Java JWT v0.9.0