package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Payment {
	public Payment() {
		
	}
	@Autowired
	Bank bank;
	public String Pay() {
		return "Payment pay is called  :: "+bank.oepnAccount();
	}
}
