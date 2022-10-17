package Array;

import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int index;
        int[] arrayA = new int[5];
        int[] arrayB = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap phan tu vao mang: ");
            index = sc.nextInt();
            arrayA[i] = index;
        }
        Scanner sc1 = new Scanner(System.in);
        for (int j = 0; j < 6; j++) {
            System.out.println("Nhap phan tu vao mang: ");
            index = sc1.nextInt();
            arrayB[j] = index;
        }
        int[] arrayC = new int[11];
        System.arraycopy(arrayA, 0, arrayC, 0, 5);
        System.arraycopy(arrayB, 0, arrayC, 5, 6);
        System.out.println(Arrays.toString(arrayC));

    }
}