public class Triangle extends TwoDShape {
    private double base;
    private double height;

    // Constructor
    public Triangle(String name, String colour, double base, double height) {
        super(name, colour);
        this.base = base;
        this.height = height;
    }

    // Getter for base
    public double getBase() {
        return base;
    }

    // Setter for base
    public void setBase(double base) {
        this.base = base;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Implement the area() method
    @Override
    public double area() {
        return 0.5 * base * height; // Area = 1/2 * base * height
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() +
               "\nTriangle base = " + base +
               "\nTriangle height = " + height +
               "\nTriangle area = " + area();
    }
}
