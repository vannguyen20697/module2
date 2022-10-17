package Array;

import java.util.Scanner;

public class ArrayTwoMax {
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
        //in mang
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        //tim gia tri lon nhat
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng: " + max);
    }
}
