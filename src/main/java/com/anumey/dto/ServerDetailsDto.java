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
public class ServerDetailsDto {
    private long serverID;
    private boolean tcpEnabled;
    private String tcpIP;
    private int tcpPort;
    private boolean udpEnabled;
    private String udpIP;
    private int udpPort;
    private boolean httpsEnabled;
    private String httpsIP;
    private int httpPort;
    private boolean webSocketEnabled;
    private int webSocketPort;
    private String webSocketIP;
    private int serverType;

    
    
    public long getServerID() {
        return serverID;
    }

    public void setServerID(long serverID) {
        this.serverID = serverID;
    }

    public boolean isTcpEnabled() {
        return tcpEnabled;
    }

    public void setTcpEnabled(boolean tcpEnabled) {
        this.tcpEnabled = tcpEnabled;
    }

    public String getTcpIP() {
        return tcpIP;
    }

    public void setTcpIP(String tcpIP) {
        this.tcpIP = tcpIP;
    }

    public int getTcpPort() {
        return tcpPort;
    }

    public void setTcpPort(int tcpPort) {
        this.tcpPort = tcpPort;
    }

    public boolean isUdpEnabled() {
        return udpEnabled;
    }

    public void setUdpEnabled(boolean udpEnabled) {
        this.udpEnabled = udpEnabled;
    }

    public String getUdpIP() {
        return udpIP;
    }

    public void setUdpIP(String udpIP) {
        this.udpIP = udpIP;
    }

    public int getUdpPort() {
        return udpPort;
    }

    public void setUdpPort(int udpPort) {
        this.udpPort = udpPort;
    }

    public boolean isHttpsEnabled() {
        return httpsEnabled;
    }

    public void setHttpsEnabled(boolean httpsEnabled) {
        this.httpsEnabled = httpsEnabled;
    }

    public String getHttpsIP() {
        return httpsIP;
    }

    public void setHttpsIP(String httpsIP) {
        this.httpsIP = httpsIP;
    }

    public int getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }

    public boolean isWebSocketEnabled() {
        return webSocketEnabled;
    }

    public void setWebSocketEnabled(boolean webSocketEnabled) {
        this.webSocketEnabled = webSocketEnabled;
    }

    public int getWebSocketPort() {
        return webSocketPort;
    }

    public void setWebSocketPort(int webSocketPort) {
        this.webSocketPort = webSocketPort;
    }

    public String getWebSocketIP() {
        return webSocketIP;
    }

    public void setWebSocketIP(String webSocketIP) {
        this.webSocketIP = webSocketIP;
    }

    public int getServerType() {
        return serverType;
    }

    public void setServerType(int serverType) {
        this.serverType = serverType;
    }
    
    
}
