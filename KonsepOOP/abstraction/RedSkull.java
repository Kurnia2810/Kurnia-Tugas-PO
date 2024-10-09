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
public class RedSkull extends Villain {
    public RedSkull() {
        super("Red Skull");
    }

    @Override
    public String getMotivation() {
        return "To conquer the world and spread Nazi ideology.";
    }
}
