package pal.appeal.userappealservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pal.appeal.userappealservice.services.PersonService;

@SpringBootApplication
public class UserAppealServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserAppealServiceApplication.class, args);
        System.out.println("Hello world!");
    }

}
