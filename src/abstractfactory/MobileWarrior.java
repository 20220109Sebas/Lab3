/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author sebastianalvarez
 */
public class MobileWarrior extends Character {

    public MobileWarrior() {
        this.name = "Mobile Warrior";
        this.platform = "Mobile";
    }

    @Override
    public void attack() {
        System.out.println(name + " ataca en " + platform);
    }
}