/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

/**
 *
 * @author Sebastian
 */
public class Soy extends Condiment {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 4.00; // Precio adicional por soya
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
