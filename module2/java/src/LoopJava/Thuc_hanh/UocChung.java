package LoopJava.Thuc_hanh;

import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so 1");
        a = input.nextInt();
        System.out.println("Nhap so 2");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Khong co yeu UCLN");
        }
        while (a != b) { //10 3
            if (a > b)
                a = a - b; //a=1
            else
                b = b - a; //
        }
        System.out.println("Greatest common factor: " + a);
    }
}
