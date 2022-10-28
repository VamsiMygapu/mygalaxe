package com.training;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/home")
	public String home() {
		return " Employee Home Controller";
	}
	@GetMapping("/checkstatus/{employeeId}/manager/{managerId}")
	public String EmployeeId(@PathVariable("employeeId")String empId,@PathVariable("managerId")String mid) {
		return empId+" is id of manger with id "+mid;
	}
	@PostMapping
	public String saveEmp(@RequestBody Employee employee) {
		return "Hello  "+employee.getEmployeeName()+" Here is your record, "+employee;
	}
	@PutMapping("{employeeId}")
	public String updateEmp(@PathVariable("employeeId")Integer empId,@RequestBody Employee employee) {
		employee.setEmployeeName("Vamsi");
		return "hello "+empId+"  ,your salary got updated with : "+employee.getEmployeeName()+" and "+employee.getSalary()+" respectively.";
	}
	@DeleteMapping
	public String deleteEmp() {
		return "delete employee finished";
	}
	
	
	

}
