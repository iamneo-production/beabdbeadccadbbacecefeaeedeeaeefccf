package main.java.com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController{
    public class ApiController{

        @GetMapping("/welcome")
        public String welcome()
        {
            return "Welcome to Spring Boot!";
        }
    }
}