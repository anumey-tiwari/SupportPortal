/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.controller;

import com.anumey.dao.ServerDetailsDao;
import com.anumey.dto.ServerDetailsDto;
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
public class ServerContoller {
    
    @Autowired
    private ServerDetailsDao serverDetailsDao;
    
    @RequestMapping("/Server")
    public ModelAndView getServer() {
        ModelAndView modelAndView = new ModelAndView("server");
        ArrayList<ServerDetailsDto> list = serverDetailsDao.getAllServer();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    public ServerDetailsDao getServerDetailsDao() {
        return serverDetailsDao;
    }

    public void setServerDetailsDao(ServerDetailsDao serverDetailsDao) {
        this.serverDetailsDao = serverDetailsDao;
    }
    
    
}
