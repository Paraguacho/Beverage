/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

/**
 *
 * @author Sebastian
 */
public class Milk extends Condiment {
    // Referencia al objeto de bebida base
    private Beverage beverage;

    // Constructor que toma una bebida base
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    // Agrega el costo del condimento al costo de la bebida base
    @Override
    public double getCost() {
        return beverage.getCost() + 5.00; // Precio adicional por leche
    }

    // Concatena la descripción del condimento a la descripción de la bebida base
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
