public class RectangleDriver {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle RectA = new Rectangle();

        // Set the length and width of the rectangle
        RectA.setLength(30);
        RectA.setWidth(25);

        // Print the rectangle's details
        System.out.println(RectA.toString());
        System.out.println("The area of the rectangle is " + RectA.getArea());
        System.out.println("The perimeter of the rectangle is " + RectA.getPerimeter());
    }
}
