package com.enit.demo;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.enit.demo.dao.postulerRepository;
import com.enit.demo.entities.Postuler;
import com.enit.demo.services.postulerServiceImpl;

@SpringBootApplication
public class DemoApplication {
	

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
       
    }
/*
    @Bean
    public CommandLineRunner start(postulerRepository postulerRepository) {
        return args -> {
        	postulerRepository.deleteAll();
        	Stream.of("130151526 jihen_charfi 1526487 true", "130211789 jihen_charfi3 1425269 false").forEach(c -> {
                postulerRepository.insert(new Postuler(c.split(" ")[0],c.split(" ")[1], c.split(" ")[2], Boolean.parseBoolean(c.split("")[3])));
            });
        	
            
            postulerRepository.findAll().forEach(System.out::println);
        };
    
   }*/
}
