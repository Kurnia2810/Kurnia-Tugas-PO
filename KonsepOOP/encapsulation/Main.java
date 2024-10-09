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
public class Main {
    public static void main(String[] args) {
        Villain venom = new Venom();
        Villain greenGoblin = new GreenGoblin();

        venom.showInfo();
        System.out.println();

        greenGoblin.showInfo();

        // Mengubah atribut menggunakan setter
        venom.setPower("Enhanced Regeneration");
        venom.setStrengthLevel(9);
        System.out.println("\nAfter Upgrade:");
        venom.showInfo();
    }
}