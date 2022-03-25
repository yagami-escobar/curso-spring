package com.platzi.market;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication // Indica a Spring Boot que es la Clase que debe ejecutar.
public class PlatziMarketApplication implements CommandLineRunner {
    // La clase que contiene el método main, la clase que ejecuta una aplicación


    public static void main(String[] args) {
        SpringApplication.run(PlatziMarketApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String user = "Jhordan";
        String password = "1234";
        int edad = 10;

        List<Object> list_data = new ArrayList<>();
        list_data.add(user);
        list_data.add(password);
        list_data.add(edad);

        System.out.println("Size:"+list_data.size());
        System.out.println(list_data.get(0));
        System.out.println(list_data.get(1));
        System.out.println(list_data.get(2));

    }
}
