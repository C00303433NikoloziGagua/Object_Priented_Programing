


public class Cylinder extends ThreeDShape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(String name, String colour, double radius, double height) {
        super(name, colour);
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Implement the area() method (Surface Area)
    @Override
    public double area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;  // Surface Area = 2πr² + 2πrh
    }

    // Implement the volume() method
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;  // Volume = πr²h
    }

    // Override toString for meaningful output
    @Override
    public String toString() {
        return super.toString() + 
               "\nCylinder radius = " + radius + 
               "\nCylinder height = " + height + 
               "\nCylinder surface area = " + area() + 
               "\nCylinder volume = " + volume();
    }
}
