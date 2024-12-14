package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/get/details")
	public ResponseEntity<String> getDetails() {
		
		return new ResponseEntity<String>("deployment is done using azure pipelines", HttpStatus.OK);
	}

}
