public class Rectangle {
    private double length;
    private double width;

    // Default constructor that initializes length and width to 1
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Method to set the length of the rectangle with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 40.0) {
            this.length = length;  // Set the length if valid
        } else {
            // Throw an exception if the length is invalid
            throw new IllegalArgumentException("The length of the rectangle must be more than 0.0 and less than 40");
        }
    }

    // Method to get the current length of the rectangle
    public double getLength() {
        return length;
    }

    // Method to set the width of the rectangle with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 40.0) {
            this.width = width;  // Set the width if valid
        } else {
            // Throw an exception if the width is invalid
            throw new IllegalArgumentException("The width of the rectangle must be more than 0.0 and less than 40");
        }
    }

    // Method to get the current width of the rectangle
    public double getWidth() {
        return width;
    }
    //visual studio begged me to do this
    @Override
    public String toString() {
        return "Length = " + length + ", Width = " + width;  // Return the length and width as a  string
    }
}
