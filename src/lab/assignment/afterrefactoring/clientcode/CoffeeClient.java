package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.CoffeeMakerTemplate;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMakerTemplate mocha = new MochaCoffee();
        mocha.prepareCoffee();

        System.out.println("********************");

        CoffeeMakerTemplate capuccino = new CapuccinoCoffee();
        capuccino.prepareCoffee();
        
        System.out.println("********************");

        CoffeeMakerTemplate americano = new AmericanoCoffee();
        americano.prepareCoffee();

    }

}
