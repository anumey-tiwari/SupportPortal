/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.service;

import com.anumey.dao.MemberDetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anumey
 */

@Service
public class LoginService {
    
    @Autowired
    private MemberDetailsDao memberDetailsDao;
    
    
    public boolean checkAuthentication(String emailId,String password){
        boolean present = false;
        MemberDetailsDto memberDetailsDto = 
        
        
        
        return present;
    }
    
    
}
