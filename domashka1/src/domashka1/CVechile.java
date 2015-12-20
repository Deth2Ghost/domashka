package domashka1;
import java.util.Scanner;
//Create default class CVechile
public class CVechile {
	float x;
	float y;
	float price;
	int speed;
	int year;

	public float getPrice() {
		return price;
	}

	public int getSpeed() {
		return speed;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getYear() {
		return year;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public CVechile(float x, float y, float price, int speed, int year) {
		super();
		this.price = price;
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.year = year;

	}
	public CVechile() {
		
	}

	public String toString() {
		return "Price:\n" + price + "\nSpeed:\n" + speed + "\nYear of issue:\n" + year
				+ "\nPosition by X and Y:\nBy X - " + x + " By Y - " + y;
	}

}
//Create class CPlane what extend CVechile and have some biggest parameters. 
class CPlane extends CVechile {
	int height;
	int mesto;

	public CPlane(float x, float y, float price, int speed, int year, int height, int mesto) {
		super(x, y, price, speed, year);
		this.height = height;
		this.mesto = mesto;

	}
	public CPlane() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter parameters for Plane:");
		System.out.println("Enter year of issue:");
		this.year = sc.nextInt();
		System.out.println("Enter maximum speed:");
		this.speed = sc.nextInt();
		System.out.println("Enter altitude:");
		this.height = sc.nextInt();
		System.out.println("Enter how many places is in that Plane:");
		this.mesto = sc.nextInt();
		System.out.println("Enter coordinate for X:");
		this.x = sc.nextFloat();
		System.out.println("Enter coordinate for Y:");
		this.y = sc.nextFloat();
		System.out.println("Enter price for that plane:");
		this.price = sc.nextFloat();
		System.out.println("Thank you!\n-------------------");

	}

	@Override
	public String toString() {
		return "This is a plane\n"+super.toString()+"\nAltitude:\n"+height+"\nPlaces:\n"+mesto;
	}

}
//Create class CCar what extend CVechile.
class CCar extends CVechile{
	public CCar(float x, float y, float price, int speed, int year) {
		super(x, y, price, speed, year);
			}
	public CCar() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter parameters for Car:");
		System.out.println("Enter year of issue:");
		this.year = sc.nextInt();
		System.out.println("Enter maximum speed:");
		this.speed = sc.nextInt();
		System.out.println("Enter coordinate for X:");
		this.x = sc.nextFloat();
		System.out.println("Enter coordinate for Y:");
		this.y = sc.nextFloat();
		System.out.println("Enter price for that car:");
		this.price = sc.nextFloat();
		System.out.println("Thank you!\n-------------------");

	}
	@Override
	public String toString() {
		
		return super.toString();
	}
	}
//Create class CPlane what extend CVechile and have some biggest parameters.
class CShip extends CVechile{
int mesto;
String port;
	public CShip(float x, float y, float price, int speed, int year,int mesto, String port) {
		super(x, y, price, speed, year);
		this.mesto = mesto;
		this.port = port;
	}
	public CShip() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter parameters for Ship:");
		System.out.println("Enter year of issue:");
		this.year = sc.nextInt();
		System.out.println("Enter maximum speed:");
		this.speed = sc.nextInt();
		System.out.println("Enter coordinate for X:");
		this.x = sc.nextFloat();
		System.out.println("Enter coordinate for Y:");
		this.y = sc.nextFloat();
		System.out.println("Enter port of assigment:");
		this.port = sc.nextLine();
		System.out.println("Enter price for that ship:");
		this.price = sc.nextFloat();
		System.out.println("Thank you!\n-------------------");

	}

	@Override
		public String toString() {
			
			return "This is a ship\n"+super.toString()+"\nAsigment port:\n"+port+"\nPlaces:\n"+mesto;
		}
	
}