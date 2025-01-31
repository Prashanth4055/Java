package com.hyd.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hyd.hotel.entity.hotel;
import com.hyd.hotel.service.HotelService;

@RestController

public class HotelController {
	
	@Autowired
	HotelService hser;
	
	@PostMapping("/myhotel/hotel/add")
	public String createNewHotel(@RequestBody hotel hotel) {
		System.out.println("from browser hotel data---->"+hotel);
		
		hser.addhotel(hotel);
		return "succesfully added new hotel---->" +hotel.getName();
	}

}
