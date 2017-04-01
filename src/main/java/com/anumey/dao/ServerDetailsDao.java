/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anumey.dao;

import com.anumey.dto.ServerDetailsDto;
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
public class ServerDetailsDao {
    public ArrayList<ServerDetailsDto> getAllServer(){
        ArrayList<ServerDetailsDto> list = new ArrayList<>();
        
        ServerDetailsDto serverDetails = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "", "");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from serverDetails");
            while (rs.next()) {
                serverDetails = new ServerDetailsDto();
                serverDetails.setTcpEnabled(rs.getBoolean("tcpEnabled"));
                serverDetails.setTcpIP(rs.getString("tcpIp"));
                serverDetails.setTcpPort(rs.getInt("tcpPort"));
                
                serverDetails.setUdpEnabled(rs.getBoolean("udpEnabled"));
                serverDetails.setUdpIP(rs.getString("udpIp"));
                serverDetails.setUdpPort(rs.getInt("udpPort"));
                
                serverDetails.setHttpsEnabled(rs.getBoolean("HttpsEnabled"));
                serverDetails.setHttpsIP(rs.getString("HttpsIp"));
                serverDetails.setHttpPort(rs.getInt("HttpsPort"));
                
                serverDetails.setWebSocketEnabled(rs.getBoolean("webSocketEnabled"));
                serverDetails.setWebSocketIP(rs.getString("webSocketIp"));
                serverDetails.setWebSocketPort(rs.getInt("webSocketPort"));
                
                serverDetails.setServerType(rs.getInt("serverType"));
                list.add(serverDetails);
                
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
