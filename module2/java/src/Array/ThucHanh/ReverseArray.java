package Array.ThucHanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //Khai báo các biến
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        //nhập và kiểm tra kích thước mảng
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không vượt quá 20");
        } while (size > 20);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        //In ra mảng đã nhập
//        System.out.println(Arrays.toString(array));
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //cach dap nguoc mang
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        //in ra mang dao nguọc
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");

        }
    }
}
