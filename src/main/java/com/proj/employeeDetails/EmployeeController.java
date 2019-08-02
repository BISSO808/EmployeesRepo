package com.proj.employeeDetails;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	static ArrayList<Employee> arrli = new ArrayList<Employee>();
	//	private static int count=0;
	@Autowired
	private EmployeeRespository employeeRepository;
	//Restful API https://localhsot:8080/user(post request)
	@PostMapping(path="/user")
	public String addAllUser(@RequestBody Employee employee) {
		//		employee.setId(count);
		Employee savedEmployee= employeeRepository.save(employee);
		return "saved";
	}
	//Restful API http://localhost:8080/user(get request)
	@GetMapping(path="/user")
	public @ResponseBody Iterable<Employee> getAllUsers() {
		// This returns a JSON or XML with the users
		return employeeRepository.findAll();	
	}
	//Restful API https://localhost:8080/{id}/delete
	@DeleteMapping(path="/user/{id}/delete")
	public String deleteUser(@PathVariable int id) {
		employeeRepository.deleteById(id);
		return "deleted";
	} 
}
