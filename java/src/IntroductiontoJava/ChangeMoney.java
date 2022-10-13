package IntroductiontoJava;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập tiền USD: ");
        usd = sc.nextDouble();
        double change = usd * 23000;
        System.out.print("Giá trị VND: " + change);
    }
}
