/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author sebastianalvarez
 */
public class PCWarrior extends Character {

    public PCWarrior() {
        this.name = "PC Warrior";
        this.platform = "PC";
    }

    @Override
    public void attack() {
        System.out.println(name + " ataca en " + platform);
    }
}
