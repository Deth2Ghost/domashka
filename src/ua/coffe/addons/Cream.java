package ua.coffe.addons;

import ua.coffe.adapter.Decorator;
import ua.coffe.beverage.Beverage;

public class Cream extends Decorator{
Beverage beverage;
public Cream(Beverage beverage2) {
    this.beverage = beverage2;
}
    @Override
    public String getDescription() {
	// TODO Auto-generated method stub
	return beverage.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
	// TODO Auto-generated method stub
	return 0.12 + beverage.cost();
    }

}
