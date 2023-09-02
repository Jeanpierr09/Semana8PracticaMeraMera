package edu;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import edu.pizza.especialidades.PizzaItaliana;
import edu.pizza.interfaces.PizzaBase;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pizza Margherita", 10.99);
        pizza.addTopping(new Topping("Tomato", 5));
        pizza.addTopping(new Topping("Mozarella", 4));
        pizza.addTopping(new Topping("Basil",3));
        pizza.prepare();
        System.out.println("El precio total de los Toppings es de " +pizza.getTtotalPrice());

        PizzaItaliana pizza2 = new PizzaItaliana("Pizza italiana", 15, "Salsa de la casa");
        System.out.println("This is the Salsa " +pizza2.getSalsa());

        PizzaBase pizza3 = new PizzaBase("PizzaBasejeje", 566);
        pizza3.prepare();
        }


    }
