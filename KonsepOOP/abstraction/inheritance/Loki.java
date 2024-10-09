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
public class Loki extends Villain {
    public Loki() {
        super("Loki", "Sorcery and Deception");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Notable for: God of Mischief");
    }
}