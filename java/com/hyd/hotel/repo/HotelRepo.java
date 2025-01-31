package com.hyd.hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyd.hotel.entity.hotel;

public interface HotelRepo extends JpaRepository<hotel,String> {

}
