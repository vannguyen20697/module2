package Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayAdd {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm vào mảng");
        int elementAdd = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = sc.nextInt();
        if (index <= 0 || index >= array.length-1 ){
            System.out.println("Không chèn được phần tử vào mảng");
        }else{
            for(int i = array.length - 1; i > index; i--){
                array[i] = array[i - 1];
            }
            array[index] = elementAdd;
        }
        System.out.println(Arrays.toString(array));

        // 1 2 3 4 5
        //2 => 100
        //1 2 100 3 4
    }
}
