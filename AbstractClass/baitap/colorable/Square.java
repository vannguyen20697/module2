package AbstractClass.baitap.colorable;

public class Square extends Shape implements Colorable {
    private double edge = 1.0;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides..");
    }
}
