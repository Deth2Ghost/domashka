package ua.coffe.type;

import ua.coffe.beverage.Beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
	
	description = "Dark Roasted";
    }

    @Override
    public double cost() {
	// TODO Auto-generated method stub
	return 1.5;
    }

}
