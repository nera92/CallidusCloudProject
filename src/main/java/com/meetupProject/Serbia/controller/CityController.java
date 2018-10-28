/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meetupProject.Serbia.controller;

import com.meetupProject.Serbia.config.AppConfig;
import com.meetupProject.Serbia.model.City;
import com.meetupProject.Serbia.model.CityWrapper;
import com.meetupProject.Serbia.model.Event;
import com.meetupProject.Serbia.model.EventWrapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Nera
 */
@Component
public class CityController {

    private List<City> cities;
    private List<Event> events;

    @Autowired
    AppConfig appConfig;

    @Autowired
    RestTemplate restTemplate;

    public List<City> listCities() {
        CityWrapper cityWrapper = restTemplate.getForObject(appConfig.getUrlMeetUp(), CityWrapper.class);
        cities = cityWrapper.getResults();
        return cities;
    }

    public List<Event> findEvents(Integer cityNumber) throws Exception {
        if (cityNumber > cities.size() || cityNumber < 0) {
            throw new Exception("Invalid city number");
        }
        City city = cities.get(cityNumber);
       // System.out.println(appConfig.getUrlEvents() + "lon=" + city.getLon() + "&lat=" + city.getLat());
        EventWrapper eventWrapper = restTemplate.getForObject(appConfig.getUrlEvents() + "lon=" + city.getLon() + "&lat=" + city.getLat(), EventWrapper.class);
      events=eventWrapper.getEvents();
        return events;
    }
}
