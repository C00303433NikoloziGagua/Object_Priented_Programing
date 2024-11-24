public class Rectangle extends TwoDShape { 
    private double length;
    private double width;

    // Constructor
    public Rectangle(String name, String colour, double length, double width) {
        super(name, colour);
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Implement the area() method
    @Override
    public double area() {
        return length * width;
    }

    // Override toString for meaningful output
    @Override
    public String toString() {
        return super.toString() + "\nRectangle length = " + length + "\nRectangle width = " + width + "\nRectangle area = " + area();
    }
}
