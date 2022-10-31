package AbstractClass.baitap.geometry;

public abstract class Shape implements Resizeable {
    private String color;
    public Shape(){
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor();
    }
    @Override
    public void resize(double percent) {

    }


}
