package IntroductiontoJava.Thuc_hanh;

import java.util.Scanner;

public class GiaPhuongTrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gia phuong trinh bac nhat 1 an ax + b = 0");
        System.out.println("nhap a");
        int a = scanner.nextInt();
        System.out.println("Nhap b");
        int b = scanner.nextInt();
        if (a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }

        }else {
            float c = -b / a;
            System.out.println("phuong trinh co 1 nghiem duy nhat : " + c);
        }
    }
}
