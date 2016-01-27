package ua.coffe.addons;

import ua.coffe.adapter.Decorator;
import ua.coffe.beverage.Beverage;

public class Soy extends Decorator{
    Beverage beverage;
    public Soy(Beverage beverage2) {
	this.beverage = beverage2;
    }

    @Override
    public String getDescription() {
	// TODO Auto-generated method stub
	return beverage.getDescription()+ ", Soy";
    }

    @Override
    public double cost() {
	// TODO Auto-generated method stub
	return 0.5 + beverage.cost();
    }

}
