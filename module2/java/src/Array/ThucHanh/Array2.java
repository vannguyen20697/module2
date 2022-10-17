package Array.ThucHanh;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //Chạy vòng lặp để đưa giá trị nhập liệu của người dùng vào mảng:
        java.util.Scanner input = new Scanner(System.in);
        // khoi tao doi tuong matrix
        int[][] matrix = new int[2][3];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        //nhap lieu cac gia tri vao mang
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        //nhap cac gia tri ngau nhien vao mang
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = (int) (Math.random() * 100);
//            }
//        }
        //in mang
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
