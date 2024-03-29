package com.springboot.springaop;

import com.springboot.springaop.business.BusinessService1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private BusinessService1 businessService1;

	public Application(BusinessService1 businessService1){
		this.businessService1 = businessService1;
	}

	private Logger logger = LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value returned is {}", businessService1.calculateMax());
	}
}
