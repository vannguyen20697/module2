package ke_thua.bai_tap;

public class Cylinder extends Circle {
    //mở rộng lớp Circle bằng cách bổ sung thuộc tính chiều cao
    private double height;

    public Cylinder() {
    }
    //constructor
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder with " +
                "height= " + getHeight() +
                " and volume= " + getVolume() +
                " which is a subclass of " +
                super.toString();
    }
}

class MainTest {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Circle cylinder2 = new Cylinder(2.0, "red", 4);
        System.out.println(cylinder2);
        //?? so sanh 2 doi tuong
        System.out.println(cylinder1.equals(cylinder2));
    }
}
