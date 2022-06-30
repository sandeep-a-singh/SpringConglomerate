package com.sunny.apps.logback.logging;

import javax.mail.MessagingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {

	public static void main(String[] args) throws MessagingException {
		SpringApplication.run(LoggingApplication.class, args);
	}

}
