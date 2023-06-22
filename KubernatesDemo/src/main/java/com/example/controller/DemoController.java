package com.example.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/greets")
	public String greet(@RequestParam("name") String greet)
	{

		return "Welcome "+greet;
	}

}
