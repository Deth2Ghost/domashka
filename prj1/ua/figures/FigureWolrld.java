package ua.figures;

public class FigureWolrld {

    public static void main(String[] args) {
	Point a = new Point(7, 33);
	System.out.println(a);
	Point b = new Point(1, 1);
	Point c = new Point(12, 12);
	Line l = new Line(b, c);
	Line l2 = new Line(new Point(2, 2), new Point(7, 7));
	Line l3 = new Line(3, 3, 15, 15);
	System.out.println(l + "\n" + l2 + "\n" + l3);
	Triangle tr = new Triangle(new Point(8, 8), new Point(16, 16), c);
	System.out.println(tr);
	ColoPoint cp = new ColoPoint(23, 33, 122112);
	Object[] mas = new Object[5];
	mas[0]=b;
	mas[1]=c;
	mas[2]=l;
	mas[3]=tr;
	mas[4]=cp;
	for (int i = 0; i < mas.length; i++) {
	    System.out.println("-----------------\n"+"Цикл №"+(i+1));
	    if(mas[i] instanceof Point){
		System.out.println(((Point)mas[i]).toString());
	    }
	    if(mas[i] instanceof Line){
		System.out.println(((Line)mas[i]).length());
	    }
	    if(mas[i] instanceof Triangle){
		System.out.println(((Triangle)mas[i]).toString());
	    }
	    System.out.println("-----------------\n");
	}
    }

}
