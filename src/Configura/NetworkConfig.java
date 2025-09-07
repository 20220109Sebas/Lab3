/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configura;

/**
 *
 * @author sebastianalvarez
 */
public enum NetworkConfig {
    INSTANCE; // única instancia garantizada por el enum

    private String serverIp = "192.168.1.199";
    private int port = 8080;

    public String getServerIp() {
        return serverIp;
    }

    public int getPort() {
        return port;
    }

    public void connect() {
        System.out.println("Conectando al servidor " + serverIp + ":" + port);
    }
}
