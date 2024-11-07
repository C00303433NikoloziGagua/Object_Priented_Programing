// Author : Nikolozi Gagua
// Date : 07/11/2024
// Purpose : circle class
class circle extends point{
    private double radius;

    public circle(double x, double y, double radius) {
        super(x, y);
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle [radius= " + radius + ", X= " + getX() + ", Y= " + getY() + "]";
    }
    
}
