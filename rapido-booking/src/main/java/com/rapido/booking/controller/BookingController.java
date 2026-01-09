package com.rapido.booking.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rapido.booking.request.BookingRequest;

@Controller
public class BookingController {

	@GetMapping("viewBooking")
	public String displayBookingPage() {
		System.out.println("BookingController.displayBookingPage():::::::::::::::::::::::::::::::::::::::;");
		return "booking";
	}

	@PostMapping("bookMyRide")
	public String bookRide(@ModelAttribute BookingRequest bookingRequest, Model model) {
		System.out.println("BookingController.bookRide()::::::::::::::::::::::::::::::::::::::::");
		String source = bookingRequest.getSource();
		String dest = bookingRequest.getDestination();
		String type = bookingRequest.getType();
		System.out.println(" Request received [" + source + " " + dest + " " + type + "]");

		String bookingCode = UUID.randomUUID().toString().replace("-", "").substring(0, 6).toUpperCase();
		System.out.println(" You booking code is " + bookingCode);
		model.addAttribute("bookingConfirmationCode", bookingCode);
		return "bookingConfirmation";
	}

}
