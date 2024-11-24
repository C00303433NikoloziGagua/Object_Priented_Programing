public class Sphere extends ThreeDShape {
    private double radius;

    // Constructor
    public Sphere(String name, String colour, double radius) {
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

    // Implement the area() method (Surface Area)
    @Override
    public double area() {
        return 4 * Math.PI * radius * radius; // Surface Area = 4πr²
    }

    // Implement the volume() method
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Volume = (4/3)πr³
    }

    // Override toString for meaningful output
    @Override
    public String toString() {
        return super.toString() + 
               "\nSphere radius = " + radius +
               "\nSphere surface area = " + area() +
               "\nSphere volume = " + volume();
    }
}
