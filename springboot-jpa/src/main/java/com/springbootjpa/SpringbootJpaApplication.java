package com.springbootjpa;

import com.springbootjpa.dao.UserRepository;
import com.springbootjpa.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
public class SpringbootJpaApplication {

	public static void main(String[] args) {

		System.out.println("APPLICATION RUNNING INSIDE MAIN METHOD");

		ApplicationContext context = SpringApplication.run(SpringbootJpaApplication.class, args);
		System.out.println("CALLING TO USER REPOSITORY");
		UserRepository userRepository = context.getBean(UserRepository.class);

		User user = new User();
		user.setName("Kumar Kanchan");
		user.setCity("Bengaluru");
		user.setStatus("Active Pro.");

		User user2 = userRepository.save(user);
		System.out.println(user2);
	}

}
