/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;
import java.util.Scanner;

/**
 *
 * @author sebastianalvarez
 */
public class Client {
    private Character warrior;
    private Weapon weapon;

    public Client(GameElementFactory factory) {
        this.warrior = factory.createWarrior();
        this.weapon = factory.createWeapon();
    }

    public void play() {
        warrior.attack();
        weapon.use();
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige plataforma: ");
        System.out.println("1. PC");
        System.out.println("2. Mobile");
        int choice = scanner.nextInt();

        GameElementFactory factory;

        if (choice == 1) {
            factory = new PCFactory();
        } else {
            factory = new MobileFactory();
        }

        Client client = new Client(factory);
        client.play();
    }
}