/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.service;

import com.anumey.dao.MemberDetailsDao;
import com.anumey.dto.MemberDetailsDto;
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

    public boolean checkAuthentication(String emailId, String password) {
        boolean present = false;
        MemberDetailsDto memberDetailsDto = memberDetailsDao.getMemberDetais(emailId);

        if (memberDetailsDto.getPassword().equals(password)) {
            present = true;
        }
        return present;
    }

    public MemberDetailsDao getMemberDetailsDao() {
        return memberDetailsDao;
    }

    public void setMemberDetailsDao(MemberDetailsDao memberDetailsDao) {
        this.memberDetailsDao = memberDetailsDao;
    }
    
    

}
