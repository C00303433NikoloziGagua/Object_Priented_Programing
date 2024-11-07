// Author : Nikolozi Gagua
// Date : 07/11/2024
// Purpose : point class
public class point
{
    private double x;
    private double y;

    public point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "point [x=" + x + ", y=" + y + "]";
    }

    
}
