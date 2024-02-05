package Models;

public class Rectangle {
    double breadth;
    double length;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void getRectangle(){
        System.out.println("Perimeter of Rectangle:" + 2*getLength()*getBreadth());
        System.out.println("Area of Rectangle: " + getLength()*getBreadth());

    }
}
