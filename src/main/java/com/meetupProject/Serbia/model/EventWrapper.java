/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meetupProject.Serbia.model;

import java.util.List;

/**
 *
 * @author Nera
 */
public class EventWrapper {
    
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public EventWrapper() {
    }
}
