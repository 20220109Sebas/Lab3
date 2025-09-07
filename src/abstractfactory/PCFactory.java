/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author sebastianalvarez
 */
public class PCFactory implements GameElementFactory {
    @Override
    public Character createWarrior() {
        return new PCWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new PCSword();
    }
}
