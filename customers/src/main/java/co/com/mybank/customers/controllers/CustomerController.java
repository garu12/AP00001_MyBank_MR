package co.com.mybank.customers.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/api")
public class CustomerController {

    @GetMapping(path = "/hello", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String helloWorld() {
        return "Hola desde el microservicio de clientes";
    }

    @GetMapping(value = "/datetime", produces = MediaType.TEXT_PLAIN_VALUE)
    public String datetime() {
        return LocalDateTime.now().toString();
    }

}
