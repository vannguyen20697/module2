package Array;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // tao 1 chuoi
        System.out.println("Mời bạn nhập một chuỗi bất kỳ");
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println("nhập từ bàn phím một ký tự?");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(character == str.charAt(i)){
                count ++;
            }

        }
        System.out.println("So lan xuat hien cua ki tu " + character +
                " trong chuoi " + str + " = " + count);
    }
}

