package com.vikas.demodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	
	@GetMapping("/test-docker")
	public String getData() {
		return "in docker project";
	}

}
