package com.cdac.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	@GetMapping("/message")
	public String getMessage() {
		
		int b=20;
		try{
		}
		catch(Exception e){
			
		}
		return "Welcome...";
		
	}

}
