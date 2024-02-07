/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beverage;

/**
 *
 * @author Sebastian
 */
public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}