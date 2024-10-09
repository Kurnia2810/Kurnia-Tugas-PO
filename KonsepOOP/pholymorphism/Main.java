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
public class Main {
    public static void main(String[] args) {
        Villain doctorDoom = new DoctorDoom();
        Villain ultron = new Ultron();

        // Menampilkan serangan dari masing-masing villain
        doctorDoom.attack();
        ultron.attack();
    }
}
