package com.boot.hotel.HotelService.repositories;

import com.boot.hotel.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepoitory extends JpaRepository<Hotel, String> {


   // List<Hotel> find
}
