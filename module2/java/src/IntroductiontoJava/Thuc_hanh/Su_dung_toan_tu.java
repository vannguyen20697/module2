package IntroductiontoJava.Thuc_hanh;

import java.util.Scanner;

public class Su_dung_toan_tu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner =  new Scanner(System.in); // khai bao doi tuong scanner

        System.out.println("Nhap chieu rong: ");
        width = scanner.nextFloat(); // nhap chieu rong
        System.out.println("nhap chieu dai: ");
        height = scanner.nextFloat(); // nhap chieu dai
        float area = width * height;
        System.out.println("Dien tich la: " + area);
    }
}
