package AbstractClass.baitap.colorable;

import AbstractClass.baitap.colorable.Colorable;
import AbstractClass.baitap.colorable.Rectangle;
import AbstractClass.baitap.colorable.Shape;
import AbstractClass.baitap.colorable.Circle;
import AbstractClass.baitap.colorable.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3, 5);
        shapes[2] = new Square(9);
        for (Shape elements : shapes) {
            if (elements instanceof Colorable) {
                ((Colorable) elements).howtoColor();
            }
            System.out.println(elements.getArea());
        }
    }
}
