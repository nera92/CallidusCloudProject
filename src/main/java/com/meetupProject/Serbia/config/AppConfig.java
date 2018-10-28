/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meetupProject.Serbia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nera
 */
@Configuration
@Component
public class AppConfig {
    
    @Value("${spring.application.name}")
    String appName;
    
    @Value("${url.meetup}")
    String urlMeetUp;
    
    @Value("${url.events}")
    String urlEvents;
    

    public String getAppName() {
        return appName;
    }

    public String getUrlMeetUp() {
        return urlMeetUp;
    }

    public String getUrlEvents() {
        return urlEvents;
    }
    
    
}
