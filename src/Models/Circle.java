package Models;

public class Circle {
    double pi = 3.145 ;
    double r ;

    public Circle(double pi, double r) {
        this.pi = pi;
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void getCircle() {
        System.out.println("Circle:");
        System.out.println("Volume of Circle: " + getPi() * getR() * getR());
        System.out.println("Area of Circle: " + 1.33333*getPi() * getR() * getR());
    }
}
