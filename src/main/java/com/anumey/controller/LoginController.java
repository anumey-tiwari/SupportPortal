/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.controller;

import com.anumey.service.LoginService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Anumey
 */

@Controller
public class LoginController {
    
    @Autowired
    private LoginService loginService;

    @RequestMapping(value= "/Login")
    public ModelAndView checkLogin(@RequestParam Map<String,String> requestParams){
        String emailId = requestParams.get("emailId");
        String password = requestParams.get("password");
        boolean result = loginService.checkAuthentication(emailId, password);
        String message = " Welcome "+emailId +" ohayo  !!";
        if(result){
            return new ModelAndView("loggedIn","message",message);
        }
        
        return new ModelAndView("lsdoo","message",message);
    }
    
    
    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
    
    
    
}
