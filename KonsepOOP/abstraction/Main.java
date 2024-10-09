/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Villain redSkull = new RedSkull();
        Villain kingpin = new Kingpin();

        // Menampilkan informasi tentang setiap villain
        redSkull.showInfo();
        System.out.println();
        kingpin.showInfo();
    }
}