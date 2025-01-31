package com.hyd.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyd.hotel.entity.hotel;
import com.hyd.hotel.repo.HotelRepo;

@Service
public class HotelService {
	@Autowired
	HotelRepo hRepo;

	public void addhotel(hotel hotel) {
		
		hRepo.save(hotel);
		
		
	
	
		
	}

}
