/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Abhishek
 */
public interface  TemperatureRepository extends CrudRepository<Temperature, Integer> {
    
    public Temperature findTopByOrderByTemp();
    public Temperature findTopByOrderByTempDesc();
    
   
    
    
    
}
