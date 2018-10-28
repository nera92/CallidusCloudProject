package com.meetupProject.Serbia;

import com.meetupProject.Serbia.controller.CityController;
import com.meetupProject.Serbia.model.City;
import com.meetupProject.Serbia.model.Event;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {
    
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        CityController cityController = context.getBean(CityController.class);
        List<City> cities = cityController.listCities();

        for(int i=0;i<cities.size();i++)
            System.out.println(i + ". " + cities.get(i));

        Scanner sc = new Scanner(System.in);

        int cityNumber = sc.nextInt();
        while(cityNumber != -1){
            try{
                 List<Event> events = cityController.findEvents(cityNumber);

        for(int i=0;i<events.size();i++)
            System.out.println(i + ". " + events.get(i));
            }catch(Exception e){
                System.out.println(e.toString());
            }finally{
                cityNumber = sc.nextInt();
            }
        }
        SpringApplication.exit(context, () -> 0);
    }
    
   

}
