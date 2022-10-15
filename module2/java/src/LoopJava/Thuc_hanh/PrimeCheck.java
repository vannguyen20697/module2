package LoopJava.Thuc_hanh;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập só nguyên tố cần kiểm tra: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Đó là số nguyên tố");
        } else {
            System.out.println("Đó không phải là số nguyên tố");
        }

    }
}
