package ua.coffe.main;

import ua.coffe.addons.Milk;
import ua.coffe.addons.Soy;
import ua.coffe.beverage.Beverage;
import ua.coffe.type.Espresso;

public class Main {

    public static void main(String[] args) {
	Beverage beverage = new Espresso();
	
	beverage = new Soy(beverage);
	beverage = new Milk(beverage);
	System.out.println(beverage.getDescription()+" "+beverage.cost()+"$");
    }

}
