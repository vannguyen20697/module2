package IntroductiontoJava.ThucHanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" Nhap nam vao");
        int year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Nam nhuan: " + year);
                } else {
                    System.out.println("Nam khong nhuan: " + year);
                }
            } else {
                System.out.println("Nam nhuan: " + year);
            }
        }else {
            System.out.println("Nam khong nhuan: " + year);
        }
    }
}
