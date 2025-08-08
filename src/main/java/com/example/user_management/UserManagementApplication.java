package com.example.user_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* What is MVC architecture?
* MVC - Model, View, Controller
* it separates data(Model)
* logic(Controller) and output(view)
* to build clean, scalable apps.
* in REST APIs, View(json)
*
* How is MVC implemented in Spring Boot REST APIs?
* @RestController handles HTTP, @Service holds logic, @Entity defines model
* Jpa Repository handles DB.
*
* Why do we use a service layer when we can write logic controller?
* to follow separation of concerns(SoC), avoid bloated controllers improve testability and maintainablility
*
* What is JPARepository and how it is used?
* it's Spring Data JPA interface that provides ready-made CRUD methods like save, findAll etc.
*
* How does data flow in Spring MVC App?
* Client -> Controller -> Service -> Respository -> DB -> Back to client/user in the form of json
*
* How does Spring Boot simplify MVC architecture?
* Auto-Configure beans, embedded server, uses annotations to reduce boilerplate code
*/

@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
