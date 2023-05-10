package com.boot.hotel.HotelService.services;

import com.boot.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create

    Hotel create(Hotel hotel);

    //getall
    List<Hotel> getAll();


    //getsingle
    Hotel get(String id);

}
