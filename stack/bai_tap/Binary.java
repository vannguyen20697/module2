package stack.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển sang nhị phân:");
        int number = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        while( number > 0){
            stack.push(number % 2);
            number = number/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
