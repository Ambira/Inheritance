package Models;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double breadth, double length, double height) {
        super(breadth, length);
        this.height = height;
    }

    public double getheight() {
        return height;
    }

    public void setheight(double height) {
        this.height = height;
    }
    public void getCuboid(){
        System.out.println("Volume of Cuboid: " + 2*getLength()*getBreadth());
    }
}
