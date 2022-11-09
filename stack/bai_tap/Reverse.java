package stack.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử:");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập vào giá trị của phần tử " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang: " + Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("Ngăn xếp stack" + stack);
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Mang sau khi dao nguoc: " + Arrays.toString(array));
    }
}
