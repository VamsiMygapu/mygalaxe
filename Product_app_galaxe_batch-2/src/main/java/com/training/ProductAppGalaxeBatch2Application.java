package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.order.Order;
import com.training.order.OrderDetails;
import com.training.order.Review;

@SpringBootApplication
@RestController
public class ProductAppGalaxeBatch2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppGalaxeBatch2Application.class, args);
	}
	@Autowired
	Payment payment;
	@Autowired
	Order order;
	@Autowired
	OrderDetails orderdetails;
	@Autowired
	Review review;
	
	@GetMapping("/welcome")
	public String Display() {
		return "Hi ra Kanna Bondam  : "+payment.Pay()+"   "+order.getDetails()+"   "+orderdetails.getDetails()+"   "+review.getDetails();
	}
	@GetMapping("/hello")
	public String Display2() {
		return order.getDetails()+"   "+orderdetails.getDetails()+"   "+review.getDetails();
	}
}
