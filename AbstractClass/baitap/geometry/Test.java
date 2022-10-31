package AbstractClass.baitap.geometry;

import AbstractClass.baitap.geometry.Shape;
import AbstractClass.baitap.geometry.Circle;
import AbstractClass.baitap.geometry.Rectangle;
import AbstractClass.baitap.geometry.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red",5);
        shapes[1] = new Square("pink",5);
        shapes[2] = new Rectangle("blue",3, 6);
        for (Shape shape : shapes) {
            System.out.printf("Diện tích trước khi thay đổi kích thước là: %.2f", shape.getArea());
            System.out.println();
            shape.resize(Math.round(Math.random() * 100 + 1));
        }
        for (Shape shape : shapes) {
            System.out.printf("Diện tích sau khi thay đổi kích thước là: %.2f", shape.getArea());
            System.out.println();
        }
    }
}
