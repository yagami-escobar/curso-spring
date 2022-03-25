package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class ControllerTest {
    @GetMapping("hola")
    public String saludar(){
        return "Hola Mundo :) desde Spring Boot";
    }
    @GetMapping("welcome")
    public String welcome(){
        return "Bienvenido al Portal :)";
    }
}
