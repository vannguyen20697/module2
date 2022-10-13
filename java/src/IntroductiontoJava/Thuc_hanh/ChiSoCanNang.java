package IntroductiontoJava.Thuc_hanh;

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("Nhập cân nặng kg của cơ thể:");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao mét cơ thể: ");
        height = scanner.nextDouble();
        double bmi = weight / Math.pow(height,2);
        if (bmi < 18.5){
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if ( bmi < 25){
            System.out.printf("bình thường và chỉ số BIM là " + bmi);
        } else  if (bmi < 30){
            System.out.printf("Hơi dư cân và chỉ số BIM là " + bmi);
        } else {
            System.out.printf("Béo phì và chỉ số BIM là " + bmi);
        }
    }
}
