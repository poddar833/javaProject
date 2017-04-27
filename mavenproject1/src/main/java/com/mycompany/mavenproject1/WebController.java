/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Abhishek
 */
@Controller
public class WebController {
    
    @RequestMapping("/graph.html")
    public String getIndex(ModelAndView modelAndView){
        return "home";
    }

 
    
}
