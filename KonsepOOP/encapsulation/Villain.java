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
public class Villain {
    private String name;
    private String power;
    private int strengthLevel;

    public Villain(String name, String power, int strengthLevel) {
        this.name = name;
        this.power = power;
        this.strengthLevel = strengthLevel;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    public void showInfo() {
        System.out.println("Villain: " + name);
        System.out.println("Power: " + power);
        System.out.println("Strength Level: " + strengthLevel);
    }
}