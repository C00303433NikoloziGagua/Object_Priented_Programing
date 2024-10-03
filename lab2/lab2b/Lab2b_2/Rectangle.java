public class Rectangle {
    private double length;
    private double width;

    // Default constructor that initializes the length and width to 1
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Setter method for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length <= 40.0) {
            this.length = length;  // Assign the valid length to the variable
        } else {
            // Throw an exception if the input is invalid
            throw new IllegalArgumentException("The length of the rectangle must be more than 0.0 and less than or equal to 40.0");
        }
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width <= 40.0) {
            this.width = width;  // Assign the valid width to the instance variable
        } else {
            // Throw an exception if the input is invalid
            throw new IllegalArgumentException("The width of the rectangle must be more than 0.0 and less than or equal to 40.0");
        }
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }


    @Override
    public String toString() {
        return "Length = " + getLength() + ", Width = " + getWidth();
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
