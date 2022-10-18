package Method.ThucHanh;

import java.util.Scanner;

public class Rectangle {

    double width, height;

    //khai báo các thuộc tính (properties)
    public Rectangle() {
    }

    //  định nghĩa các phương thức khởi tạo (contructors)
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Định nghĩa các phương thức getArea(), getPerimeter(), display()
    public double getArea() {

        return this.width * this.height;
    }

    public double getPerimeter() {

        return (this.width + this.height) * 2;
    }

    public String display() {

        return
                "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}

//Tạo class Main chứa phương thức main để thực thi chương trìnH
class Main { // sao khong phai public

    public static void main(String[] args) {
        //KHAI BAO BIEN NHAP GIA TRI
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        //Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức khởi tạo
        // chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }

}
