/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configura;

/**
 *
 * @author sebastianalvarez
 */
public class GameConfig {
    private static volatile GameConfig instance; 

    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;


    private GameConfig() {
        this.databaseUrl = "oraclee://localhost:3306/BD";
        this.debugMode = false;
        this.maxPlayers = 4;
    }

    // Método estático thread-safe (Double Checked Locking)
    public static GameConfig getInstance() {
        if (instance == null) {
            synchronized (GameConfig.class) {
                if (instance == null) {
                    instance = new GameConfig();
                }
            }
        }
        return instance;
    }

    // Métodos de negocio
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
}
