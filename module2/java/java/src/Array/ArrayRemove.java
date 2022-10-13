package Array;

import java.util.Scanner;

public class ArrayRemove {
    public static void main(String[] args) {
        int[] array = {10, 4, 16, 7, 8, 6, 8, 10,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int removeElement = sc.nextInt();
        int i;
        int index = 0;
        for (i = 0; i < array.length; i++) {
            if (removeElement == array[i]) {
                index = i;
            }
        }
        System.out.println(removeElement + " ở vị trí index = " + index);
        for (; index < array.length -1; index++) {
            array[index] = array[index + 1];
        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + ", ");
        }
    }
}
