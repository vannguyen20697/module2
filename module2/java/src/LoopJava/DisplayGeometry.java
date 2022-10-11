package LoopJava;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông có góc vuông phía dưới");
            System.out.println("3. In hình tam giác vuông có góc vuông phía trên");
            System.out.println("4. Exit");
            System.out.println("Lựa chọn của bạn là gì: ");
            choice = input.nextInt();
            int i;
            int j;
            switch (choice) {
                case 1:
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j < 4; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j <= 4 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.out.println("Cám ơn bạn đã sử dụng hệ thống");
                    System.exit(4);
                default:
                    System.out.println("Hãy nhập lại lựa chọn của bạn!");
            }
        }
    }
}
