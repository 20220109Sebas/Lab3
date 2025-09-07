/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author sebastianalvarez
 */
public class PCSword extends Weapon {

    public PCSword() {
        this.name = "PC Sword";
        this.platform = "PC";
    }

    @Override
    public void use() {
        System.out.println("Con " + name + " y el poder de " + platform);
    }
}
