/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

/**
 *
 * @author Sebastian
 */
public class Main {
    public static void main(String[] args) {
        // Creamos una bebida base
        Beverage beverage = new DarkRoast();
        System.out.println("Bebida base: " + beverage.getDescription() + ", Costo: $" + beverage.getCost());

        // Agregamos condimentos
         beverage = new Chocolate(beverage);

        // Imprimimos la descripción de la bebida con los condimentos y el costo total
        System.out.println("Bebida con condimentos: " + beverage.getDescription() + ", Costo: $" + beverage.getCost());
    }
}