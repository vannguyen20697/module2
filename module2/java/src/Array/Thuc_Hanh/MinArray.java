package Array.Thuc_Hanh;

import java.util.Scanner;
import java.util.Arrays;

public class MinArray {
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap kich thuoc cua mang");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kich thuoc size khong duoc qua 20");
            }
        } while (size > 20);
        // nhap gia tri mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        //In ra danh sách tài sản đã nhập
//        System.out.println(Arrays.toString(array));
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }
}
