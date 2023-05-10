package com.boot.rating.RatingService.services;

import com.boot.rating.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create
    Rating create(Rating rating);



    //getallratings
    List<Rating> getRatings();



    //get all by userid
    List<Rating> getRatingsByUserId(String userId);


    //get all by hotelid
    List<Rating> getRatingByHotelId(String hotelId);

}
