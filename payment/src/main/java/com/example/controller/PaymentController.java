package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.PaymentApplication;
import com.example.request.PaymentRequest;

@RestController

public class PaymentController {

    private final PaymentApplication paymentApplication;


    PaymentController(PaymentApplication paymentApplication) {
        this.paymentApplication = paymentApplication;
    }
	
	
	@PostMapping("/processpayment")
	public String processpayment(@RequestBody PaymentRequest request)
	{
		
		
		int amount=request.getAmount();
		String describtion=request.getDescription();
		String bank=request.getBank();
		String paymenttype=request.getPaymenttype();
	
         System.out.println("PaymentRequest [amount=" + amount + ", description=" + describtion + ", bank=" + bank + ", paymenttype="
 				+ paymenttype + "]" );
		return "Payment processed sucessfully";
		
		
	}

}
