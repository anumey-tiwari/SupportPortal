/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.dao;

import com.anumey.dto.MemberDetailsDto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

/**
 *
 * @author Anumey
 */
@Component
public class MemberDetailsDao {

    public MemberDetailsDto getMemberDetais(String emailID) {
        MemberDetailsDto memberDetails = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "", "");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from memberdetails where emailID ='" + emailID + "'");
            if (rs.next()) {
                memberDetails = new MemberDetailsDto();
                memberDetails.setMemberID(rs.getLong("memberId"));
                memberDetails.setPassword(rs.getString("password"));
                memberDetails.setEmailID(rs.getString("emailID"));
                memberDetails.setIsDeleted(rs.getByte("isDeleted"));
                memberDetails.setActivationStatus(rs.getByte("activationStatus"));
                memberDetails.setIsAdmin(rs.getBoolean("iisAdmin"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return memberDetails;
    }

    public ArrayList<MemberDetailsDto> getAllMembers() {
        ArrayList<MemberDetailsDto> list = new ArrayList<>();

        MemberDetailsDto memberDetails = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "", "");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from memberdetails");
            while (rs.next()) {
                memberDetails = new MemberDetailsDto();
                memberDetails.setMemberID(rs.getLong("memberId"));
                memberDetails.setPassword(rs.getString("password"));
                memberDetails.setEmailID(rs.getString("emailID"));
                memberDetails.setIsDeleted(rs.getByte("isDeleted"));
                memberDetails.setActivationStatus(rs.getByte("activationStatus"));
                memberDetails.setIsAdmin(rs.getBoolean("iisAdmin"));

                list.add(memberDetails);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return list;
    }

}
