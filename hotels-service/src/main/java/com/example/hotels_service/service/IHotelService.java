package com.example.hotels_service.service;

import com.example.hotels_service.model.Hotel;

import java.util.List;

public interface IHotelService {

    public List<Hotel> getHotelByCityId (Long city_id);
}
