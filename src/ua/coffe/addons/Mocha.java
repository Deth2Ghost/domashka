package ua.coffe.addons;

import ua.coffe.adapter.Decorator;
import ua.coffe.beverage.Beverage;

public class Mocha extends Decorator{
    Beverage beverage;
public Mocha(Beverage beverage2) {
    this.beverage = beverage2;
}
    @Override
    public String getDescription() {
	// TODO Auto-generated method stub
	return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
	// TODO Auto-generated method stub
	return 0.33 + beverage.cost();
    }

}
