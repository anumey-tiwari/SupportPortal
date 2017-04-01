/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.controller;

import com.anumey.dao.CompanyDetailsDao;
import com.anumey.dto.CompanyDetailsDto;
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
public class CompanyController {
    
    @Autowired
    private CompanyDetailsDao companyDetailsDao;
    
    @RequestMapping("/Company")
    public ModelAndView getCompany(){
        ModelAndView modelAndView = new ModelAndView("company");
        
        ArrayList<CompanyDetailsDto> list = companyDetailsDao.getAllCompanys();
        modelAndView.addObject("list", list);
        System.out.println(" All fine");
        return modelAndView;
    }

    public CompanyDetailsDao getCompanyDetailsDao() {
        return companyDetailsDao;
    }

    public void setCompanyDetailsDao(CompanyDetailsDao companyDetailsDao) {
        this.companyDetailsDao = companyDetailsDao;
    }
    
    
    
}
