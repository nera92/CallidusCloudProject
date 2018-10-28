/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meetupProject.Serbia;

import com.meetupProject.Serbia.controller.CityController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CommandLiner implements CommandLineRunner {

    @Autowired
    CityController cityController;    

    @Autowired
    ApplicationContext appContext;

    @Override
    public void run(String... args) throws Exception {

        
    }

}
