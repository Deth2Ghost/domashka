package ua.coffe.type;

import ua.coffe.beverage.Beverage;

public class Decaf extends Beverage{

    public Decaf() {
	
	description = "Whithout coffeine";
    }

    @Override
    public double cost() {
	// TODO Auto-generated method stub
	return 1.7;
    }

}
