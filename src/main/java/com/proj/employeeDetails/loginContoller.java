package com.proj.employeeDetails;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginContoller {
	@PostMapping 
	public void login(@RequestBody User user ) {

	}
}
