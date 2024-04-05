package com.vikas.demodocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDockerApplication implements CommandLineRunner {

	public static final Logger logger= LoggerFactory.getLogger(DemoDockerApplication.class);

	public static void main(String[] args) {
         logger.info("Hey i am CI and CD");
		SpringApplication.run(DemoDockerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Hey its 2nd logger");
	}
}
