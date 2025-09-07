/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author sebastianalvarez
 */
public class MobileSword extends Weapon {

    public MobileSword() {
        this.name = "Mobile Sword";
        this.platform = "Mobile";
    }

    @Override
    public void use() {
        System.out.println("Usando " + name + " en " + platform);
    }
}
