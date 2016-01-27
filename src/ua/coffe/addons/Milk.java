package ua.coffe.addons;

import ua.coffe.adapter.Decorator;
import ua.coffe.beverage.Beverage;

public class Milk extends Decorator{
    Beverage beverage;

    public Milk(Beverage beverage2) {
	this.beverage = beverage2;
    }

    @Override
    public String getDescription() {
	// TODO Auto-generated method stub
	return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
	// TODO Auto-generated method stub
	return .20 + beverage.cost();
    }

}
