package AbstractClass.baitap.geometry;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(String color, double radius) {
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

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }
}
