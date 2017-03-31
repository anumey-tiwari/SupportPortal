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
public class MemberDetailsDto {
    private long memberID;
    private long companyID;
    private String password;
    private String emailID;
    private byte isDeleted;
    private byte activationStatus;
    private boolean isAdmin;

    public MemberDetailsDto(long memberID, long companyID, String password, String emailID, 
            byte isDeleted, byte activationStatus, boolean isAdmin) {
        this.memberID = memberID;
        this.companyID = companyID;
        this.password = password;
        this.emailID = emailID;
        this.isDeleted = isDeleted;
        this.activationStatus = activationStatus;
        this.isAdmin = isAdmin;
    }

    
    
    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    
    
    
    
    public long getMemberID() {
        return memberID;
    }

    public void setMemberID(long memberID) {
        this.memberID = memberID;
    }

    public long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(long companyID) {
        this.companyID = companyID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public byte getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(byte activationStatus) {
        this.activationStatus = activationStatus;
    }

    
}
