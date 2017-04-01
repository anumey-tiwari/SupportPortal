/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.dto;

/**
 *
 * @author Anumey
 */
public class CompanyDetailsDto {
    private long companyID;
    private String name;
    private String emailId;
    private long signallingID;
    private long chatID;

    public CompanyDetailsDto() {
    }

    
    
    public CompanyDetailsDto(long companyID, String name, String emailId, 
            long signallingID, long chatID) {
        this.companyID = companyID;
        this.name = name;
        this.emailId = emailId;
        this.signallingID = signallingID;
        this.chatID = chatID;
    }

    public long getSignallingID() {
        return signallingID;
    }

    public void setSignallingID(long signallingID) {
        this.signallingID = signallingID;
    }

    public long getChatID() {
        return chatID;
    }

    public void setChatID(long chatID) {
        this.chatID = chatID;
    }

    

    
    
    public long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(long companyID) {
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    
}
