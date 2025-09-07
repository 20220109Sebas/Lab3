/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaJuegos;

/**
 *
 * @author sebastianalvarez
 */
public class RPGFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new RPGGame();
    }
}

