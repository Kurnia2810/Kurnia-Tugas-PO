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
public class Villain {
    private String name;
    private String power;

    public Villain(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public void showInfo() {
        System.out.println("Villain: " + name);
        System.out.println("Power: " + power);
    }
}