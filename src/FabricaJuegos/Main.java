/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaJuegos;

/**
 *
 * @author sebastianalvarez
 */
public class Main {
    public static void main(String[] args) {
        GameFactory rpgFactory = new RPGFactory();
        GameFactory fpsFactory = new FPSFactory();
        GameFactory puzzleFactory = new PuzzleFactory();

        System.out.println("== Probando RPG Factory ===");
        rpgFactory.playGame();

        System.out.println("\n== Probando FPS Factory ==");
        fpsFactory.playGame();

        System.out.println("\n==Probando Puzzle Factory ===");
        puzzleFactory.playGame();
    }
}


