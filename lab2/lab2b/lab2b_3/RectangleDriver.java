public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle RectA = new Rectangle();

        // Set the length and width of the rectangle
        RectA.setLength(10);
        RectA.setWidth(5);

        // Print the rectangle details
        System.out.println(RectA.toString());
        System.out.println("The area of the rectangle is " + RectA.getArea());
        System.out.println("The perimeter of the rectangle is " + RectA.getPerimeter());

        // Print the visual representation of the rectangle
        RectA.printRectangle();
    }
}
