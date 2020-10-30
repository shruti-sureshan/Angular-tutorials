package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception{
		this.userRepository.save(new User("Riya", "A", "riya@gmail.com"));
		this.userRepository.save(new User("Sita", "B", "sita@gmail.com"));
		this.userRepository.save(new User("Pooja", "A", "pooja12@gmail.com"));
		this.userRepository.save(new User("Raj", "C", "raj99@gmail.com"));
	}

}
