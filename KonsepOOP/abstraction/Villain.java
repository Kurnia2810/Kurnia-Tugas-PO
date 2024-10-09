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
public abstract class Villain {
    private String name;

    public Villain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract String getMotivation();
    
    public void showInfo() {
        System.out.println("Villain: " + name);
        System.out.println("Motivation: " + getMotivation());
    }
}