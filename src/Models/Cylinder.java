package Models;

public class Cylinder extends Circle{
    private double height ;

    public Cylinder(double pi, double r, double height) {
        super(pi, r);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void getCylinder() {
        System.out.println("Cylinder:");
        System.out.println("Volume of Cylinder: " + getHeight()*getPi()*getR()*getR());
        System.out.println("Area of Cylinder: " + 2*getPi()*getR()*getHeight());

    }
}
