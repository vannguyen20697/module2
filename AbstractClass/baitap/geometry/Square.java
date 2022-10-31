package AbstractClass.baitap.geometry;

public class Square extends Shape {
    private  double side;
    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(double percent) {
        this.side += this.side * this.side * percent / 100;
    }
}
