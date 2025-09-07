/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configura;

/**
 *
 * @author sebastianalvarez
 */
public class Main {
    public static void main(String[] args) {
        GameSession session = new GameSession();
        session.startSession();

        NetworkManager network = new NetworkManager();
        network.connect();


        DatabaseManager db = new DatabaseManager();
        db.saveData();
    }
}
