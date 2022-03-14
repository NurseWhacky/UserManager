package com.thenetvalue6.UserManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagerApplication.class, args);
	}

    //aggiungo utenti al primo avvio dell'app
    //CommandLineRunner run(UserService userService) {
    //    return args -> {
    //
    //    };

}
