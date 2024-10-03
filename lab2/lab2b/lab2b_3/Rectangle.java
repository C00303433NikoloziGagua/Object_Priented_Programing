        public class Rectangle {
            private double length;
            private double width;

            // Constructor with default values
            public Rectangle() {
                this.length = 1;
                this.width = 1;
            }

            // Set length with validation
            public void setLength(double length) {
                if (length > 0.0 && length <= 40.0) {
                    this.length = length;
                } else {
                    throw new IllegalArgumentException("The length of the rectangle must be more than 0.0 and less than or equal to 40.0");
                }
            }

            // Get length
            public double getLength() {
                return length;
            }

            // Set width with validation
            public void setWidth(double width) {
                if (width > 0.0 && width <= 40.0) {
                    this.width = width;
                } else {
                    throw new IllegalArgumentException("The width of the rectangle must be more than 0.0 and less than or equal to 40.0");
                }
            }

            // Get width
            public double getWidth() {
                return width;
            }
            
            @Override

            // toString method
            public String toString() {
                return "Length = " + getLength() + ", Width = " + getWidth();
            }

            // Get area
            public double getArea() {
                return length * width;
            }

            // Get perimeter
            public double getPerimeter() {
                return 2 * (length + width);
            }

            // Print rectangle with stars
            public void printRectangle() {
                // Create the full row of stars for the first and last row
                String row = "*".repeat((int) width);

                // Print the first row (full row of stars)
                System.out.println(row);

                // Print the middle rows (stars at the beginning and end, spaces in between)
                for (int x = 0; x < length - 2; x++) {
                    System.out.print("*"); // First star in the row
                    for (int o = 0; o < width - 2; o++) {
                        System.out.print(" "); // Spaces between the stars
                    }
                    if (width > 1) {
                        System.out.println("*"); // Last star in the row
                    } else {
                        System.out.println(); // Move to the next line if width is 1
                    }
                }

                // Print the last row (full row of stars)
                System.out.println(row);
            }
        }
