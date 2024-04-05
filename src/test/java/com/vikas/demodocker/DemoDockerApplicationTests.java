package com.vikas.demodocker;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoDockerApplicationTests {
	public static final Logger logger= LoggerFactory.getLogger(DemoDockerApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("its test class");
		assertEquals(true,true);
	}

}
