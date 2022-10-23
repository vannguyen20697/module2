package ke_thua.thuchanh;

public class CircleExem extends Shape {
    private double radius = 1.0;
    public CircleExem() {
    }

    public CircleExem(double radius) {
        this.radius = radius;
    }

    public CircleExem(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}

class CircleTest {
    public static void main(String[] args) {
        CircleExem circleExem = new CircleExem();
        System.out.println(circleExem);

        circleExem = new CircleExem(3.5);
        System.out.println(circleExem);

        circleExem = new CircleExem("indigo", false, 3.5);
        System.out.println(circleExem);
    }
}