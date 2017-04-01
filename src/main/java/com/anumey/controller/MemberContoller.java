/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.controller;

import com.anumey.dao.MemberDetailsDao;
import com.anumey.dto.MemberDetailsDto;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Anumey
 */


@Controller
public class MemberContoller {
    
    @Autowired
    private MemberDetailsDao memberDetialsdao;
    
    @RequestMapping("/Member")
    public ModelAndView getMember(){
        ModelAndView modelAndView = new ModelAndView("member");
        
        ArrayList<MemberDetailsDto> list = memberDetialsdao.getAllMembers();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    public MemberDetailsDao getMemberDetialsdao() {
        return memberDetialsdao;
    }

    public void setMemberDetialsdao(MemberDetailsDao memberDetialsdao) {
        this.memberDetialsdao = memberDetialsdao;
    }
    
    
}
