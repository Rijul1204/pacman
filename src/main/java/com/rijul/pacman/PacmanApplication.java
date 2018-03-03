package com.rijul.pacman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rijul.pacman.service.GameService;

@SpringBootApplication
public class PacmanApplication implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(PacmanApplication.class, args);
		
		
		
	}
	
	@Override
    public void run(String... args) throws Exception {

		GameService gameService = context.getBean(GameService.class);
		
		gameService.start();
    }
}
