package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.money.Gpay;

@Component
public class Bank {
	@Autowired
	Gpay gpay;
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public String oepnAccount() {
		return "Bank openAccount is called ::: "+gpay.onlinePay();
	}
}
