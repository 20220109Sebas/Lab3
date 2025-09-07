/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configura;

/**
 *
 * @author sebastianalvarez
 */
public class GameSession {
    public void startSession() {
        GameConfig config = GameConfig.getInstance();
        System.out.println("Iniciando sesión con máximo de jugadores: " + config.getMaxPlayers());
    }
}
