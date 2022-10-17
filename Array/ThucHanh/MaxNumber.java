package Array.ThucHanh;

import java.util.Scanner;
import java.util.Arrays;

public class MaxNumber {
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
        while ( i < array.length){
            System.out.println("Nhap phan tu thu " + (i + 1) +" : ");
            array[i] = scanner.nextInt();
            i++;
        }
        //In ra danh sách tài sản đã nhập
//        System.out.println(Arrays.toString(array));
        for ( int j = 0; j < size; j++){
            System.out.print(array[j] + "\t");
        }
        //Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 0;
        for( int k = 1; k < array.length; k++){
            if( array[k] > max){
                max = array[k];
                index = k + 1;
            }
        }
        System.out.println("Gia tri lon nhat trong mang: " + max);
        System.out.println("vi tri cua phan tu do: " + index);
    }
}
