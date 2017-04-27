/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Abhishek
 */
@Service
public class ServiceClass {
    
    @Autowired
    private TemperatureRepository tr ;
    
    public List<Temperature> getAllTemperature(){
        List<Temperature> temp = new ArrayList<Temperature>();
        tr.findAll().forEach(temp::add);
        return temp;  
    }
    
    public void addTemperture(Temperature temp){
        tr.save(temp);
    }
    
    public Temperature getMinTemperature(){
       return  tr.findTopByOrderByTemp();
    }
    
    public Temperature getMaxTemperature(){
       return  tr.findTopByOrderByTempDesc();
    }
    
   
    
    
}
