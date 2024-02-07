/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

/**
 *
 * @author Sebastian
 */
public class WhippedCream extends Condiment {
    private Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 6.00; // Precio adicional por crema batida
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }
}