/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.dao;

import com.anumey.dto.CompanyDetailsDto;
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
public class CompanyDetailsDao {

    public ArrayList<CompanyDetailsDto> getAllCompanys() {
        ArrayList<CompanyDetailsDto> list = new ArrayList<>();

        CompanyDetailsDto companyDetails = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "", "");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from companyDetails");
            while (rs.next()) {
                companyDetails = new CompanyDetailsDto();
                companyDetails.setCompanyID(rs.getLong("companyId"));
                companyDetails.setName(rs.getString("name"));
                companyDetails.setEmailId(rs.getString("emailId"));
                companyDetails.setSignallingID(rs.getLong("signallingID"));
                companyDetails.setChatID(rs.getLong("chatID"));
                list.add(companyDetails);

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
