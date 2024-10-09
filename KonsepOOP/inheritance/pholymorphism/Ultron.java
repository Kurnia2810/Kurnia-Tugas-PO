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
public class Ultron extends Villain {
    public Ultron() {
        super("Ultron");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with an army of robots!");
    }
}