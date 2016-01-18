package ua.figures;

public class Triangle {
    Point apexA, apexB, apexC;
    Line sideA, sideB, sideC;

    public Point getApexA() {
	return apexA;
    }
    public void setApexA(Point apexA) {

	this.apexA = apexA;
	sideB=null;
	sideC=null;
    }
    public Point getApexB() {
	return apexB;
    }
    public void setApexB(Point apexB) {

	this.apexB = apexB;
	sideA=null;
	sideC=null;
    }
    public Point getApexC() {
	return apexC;
    }
    public void setApexC(Point apexC) {

	this.apexC = apexC;
	sideB=null;
	sideA=null;
    }
    public double getSideB() {
	if (sideB == null) {
	    this.sideB = new Line(apexA, apexC);
	}
	return this.sideB.length();
    }
    public double getSideA() {
	if (sideA == null) {
	    this.sideA = new Line(apexB, apexC);
	}
	return this.sideA.length();
    }
    public double getSideC() {
	if (sideC == null) {
	    this.sideC = new Line(apexB, apexA);
	}
	return this.sideC.length();
    }

    public Triangle(Point apexA, Point apexB, Point apexC) {
	this.apexA = apexA;
	this.apexB = apexB;
	this.apexC = apexC;
	// sideA = new Line(apexB, apexC);
	// sideB = new Line(apexA, apexC);
	// sideC = new Line(apexB, apexA);

    }
   @Override
public String toString() {
    return "Triangle [apexA=" + apexA + ", apexB=" + apexB + ", apexC=" + apexC + "]";
}

   
}
