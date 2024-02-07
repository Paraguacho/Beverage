/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

/**
 *
 * @author Sebastian
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double getCost() {
        return 36.00;
    }
}