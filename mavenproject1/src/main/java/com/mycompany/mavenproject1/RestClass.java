/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Abhishek
 */
@Component
public class RestClass implements CommandLineRunner {
    
    @Autowired
    private ServiceClass sc ;
    @Scheduled(fixedRate = 5000)
    public  void sayHi() throws IOException{
        RestTemplate restTemplate = new RestTemplate();
        
        ResponseEntity<String> response = restTemplate.getForEntity(
            "http://openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1",
            String.class);
            String s = response.getBody();
            
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(s);
        JsonNode coordinatesNode = node.at("/main/temp");
        System.out.println(coordinatesNode);
        
                
        Temperature t =mapper.treeToValue(coordinatesNode, Temperature.class);
        String date ;
        String DATE_FORMAT = "yyyy/MM/dd HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        Calendar c1 = Calendar.getInstance(); 
        System.out.println("Today is " + sdf.format(c1.getTime()));
        date = sdf.format(c1.getTime());
        t.setDate(date);
        
        
        sc.addTemperture(t);
        
        
        
        
        

        
        
        
        
        
         
         
    }

    @Override
    public void run(String... strings) throws Exception {
        sayHi();
        
         }
    
}
