/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meetupProject.Serbia.model;

/**
 *
 * @author Nera
 */
public class Event {
    private String created;
    private String duration;
     private String id;
    private String name;
     private String status;
    private String time;
     private String local_date;
    private String local_time;
    private String updated;
    private String utc_offset; 
    private String waitlist_count;
    private String yes_rsvp_count; 
    private String link;
    private String description;
    private String visibility;
    
    
    

    public Event() {
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocal_date() {
        return local_date;
    }

    public void setLocal_date(String local_date) {
        this.local_date = local_date;
    }

    public String getLocal_time() {
        return local_time;
    }

    public void setLocal_time(String local_time) {
        this.local_time = local_time;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset;
    }

    public String getWaitlist_count() {
        return waitlist_count;
    }

    public void setWaitlist_count(String waitlist_count) {
        this.waitlist_count = waitlist_count;
    }

    public String getYes_rsvp_count() {
        return yes_rsvp_count;
    }

    public void setYes_rsvp_count(String yes_rsvp_count) {
        this.yes_rsvp_count = yes_rsvp_count;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Name: " + name +", duration: " + duration + ", local date: " + local_date + ", local time: " + local_time + ", link: " + link + ", description: " + description;
    }
    
    
}
