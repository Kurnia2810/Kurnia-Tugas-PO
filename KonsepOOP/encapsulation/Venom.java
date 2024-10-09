/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Asus
 */
public class Venom extends Villain {
    public Venom() {
        super("Venom", "Superhuman Strength and Agility", 8);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Notable for: Symbiote powers");
    }
}