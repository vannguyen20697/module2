package Access.BaiTap;



public class TestCircle {
    public static void main(String[] args) {
        //Constructor mặc định
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        //Constructor có truyền tham số
        Circle circle1 = new Circle (2.0,"blue");
        System.out.println("Bán kính của hình tròn là: " + circle1.getRadius());
        System.out.println("Diện tích của hình tròn là: " + circle1.getArea());
        System.out.println("Màu của hình tròn: " + circle1.getColor());
    }
}
