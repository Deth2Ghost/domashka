package ua.figures;

public class Line {

    private Point start, end;

    public Point getStart() {
	return start;
    }

    public void setStart(Point start) {
	this.start = start;
    }

    public Point getEnd() {
	return end;
    }

    public void setEnd(Point end) {
	this.end = end;
    }

    public Line(Point start, Point end) {
	super();
	this.start = start;
	this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
	start = new Point(x1, y1);
	end = new Point(x2, y2);

    }

    double length() {
	return Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(start.getY() - end.getY(), 2));
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return "\n-----------------\n" + "Начало линии:\n" + start + "\n" + "Конец линии:\n" + end
		+ "\n-----------------\n";
    }

}
