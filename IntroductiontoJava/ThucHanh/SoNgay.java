package IntroductiontoJava.ThucHanh;

import java.util.Scanner;

public class SoNgay {
    public static void main(String[] args) {
        int month;
        System.out.println("Nhập tháng muốn biết bao nhiêu ngày: ");
        Scanner scanner = new Scanner(System.in);
        month = scanner.nextInt();
        if (month <= 12) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang đó có 31 ngày");
                    break;
                case 2:
                    System.out.println("Thang do co 28 hoac 29 ngay");
                    break;
                default:
                    System.out.println("thang do co 30 ngay");
                    break;

            }
        } else {
            System.out.println("Thang do khong ton tai");
        }

    }
}
