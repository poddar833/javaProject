/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Abhishek
 */

@RestController
public class RestControllerBean {
    
    @Autowired
    private ServiceClass sc ;
    
    @RequestMapping("/TodayTemp")
    public List<Temperature> getTemp(){
        return sc.getAllTemperature();
    }
    @RequestMapping("/TodayMax_Min_Temp")
    public List<Temperature>  getMinTemp(){
        List<Temperature> l = new ArrayList<Temperature>();
        l.add(sc.getMinTemperature());
        l.add(sc.getMaxTemperature());
       
        return l;
    }
    
}
