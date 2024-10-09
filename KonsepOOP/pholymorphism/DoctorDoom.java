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
public class DoctorDoom extends Villain {
    public DoctorDoom() {
        super("Doctor Doom");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " uses his mastery of sorcery and technology!");
    }
}
