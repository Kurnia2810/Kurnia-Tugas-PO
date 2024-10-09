/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Villain thanos = new Thanos();
        Villain loki = new Loki();

        thanos.showInfo();
        System.out.println();
        loki.showInfo();
    }
}