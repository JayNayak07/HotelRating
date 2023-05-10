package com.boot.hotel.HotelService.services.impl;

import com.boot.hotel.HotelService.entities.Hotel;
import com.boot.hotel.HotelService.exceptions.ResourceNotFoundException;
import com.boot.hotel.HotelService.repositories.HotelRepoitory;
import com.boot.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepoitory hotelRepoitory;
    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepoitory.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepoitory.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepoitory.findById(id).orElseThrow((() -> new ResourceNotFoundException("hotel with given id not found !!")));
    }
}
