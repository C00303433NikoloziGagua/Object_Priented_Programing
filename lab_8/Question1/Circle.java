public class Circle extends TwoDShape {
    private double radius;

    // Constructor
    public Circle(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement the area() method
    @Override
    public double area() {
        return Math.PI * radius * radius; // Area = πr²
    }

    // Override toString for meaningful output
    @Override
    public String toString() {
        return super.toString() + "\nCircle radius = " + radius + "\nCircle area = " + area();
    }
}
