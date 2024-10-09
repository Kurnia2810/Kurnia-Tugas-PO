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

public class GreenGoblin extends Villain {
    public GreenGoblin() {
        super("Green Goblin", "Genius-Level Intellect", 7);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Notable for: Goblin Glider and Pumpkin Bombs");
    }
}
