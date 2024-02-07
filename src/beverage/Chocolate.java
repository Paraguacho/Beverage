/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

/**
 *
 * @author Sebastian
 */
public class Chocolate extends Condiment {
    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 3.00; // Precio adicional por chocolate
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }
}

