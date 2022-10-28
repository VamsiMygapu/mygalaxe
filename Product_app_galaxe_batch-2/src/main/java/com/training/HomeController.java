package com.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/home")
	public String home() {
		return "Home Controller";
	}
	@GetMapping("/message")
	public String message1() {
		return "Hi Tufail";
	}
	@GetMapping("/message/{empName}")
	public String message1(@PathVariable("empName")String ename) {
		return "Hii ra "+ename;
	}

}
