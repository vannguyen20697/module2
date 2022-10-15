package LoopJava.Thuc_hanh;

import java.util.Scanner;

public class CalulateMoney {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất");
        interestRate = scanner.nextDouble();
        double total = 0;
        for (int i  = 0; i < month; i++){
            total += money  * (interestRate/100)/12 * month;
        }
        System.out.println("lãi xuất tính được: " + total);
    }
}
