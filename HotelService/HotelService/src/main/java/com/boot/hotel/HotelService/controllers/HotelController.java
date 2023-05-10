package com.boot.hotel.HotelService.controllers;

import com.boot.hotel.HotelService.entities.Hotel;
import com.boot.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){

        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }


    //getsingle
    @GetMapping("/{hotelid}")
    public ResponseEntity<Hotel> createHotel(@PathVariable String hotelid){

        return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelid));
    }



    //getall

    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(hotelService.getAll());
    }

}
