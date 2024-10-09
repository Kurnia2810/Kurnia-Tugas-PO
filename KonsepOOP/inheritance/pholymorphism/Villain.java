/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pholymorphism;

/**
 *
 * @author Asus
 */
public class Villain {
    private String name;

    public Villain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Metode ini akan dioverride oleh subclass
    public void attack() {
        System.out.println(name + " is attacking!");
    }
}