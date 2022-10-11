package LoopJava;

public class DisplayPrime {
    public static void main(String[] args) {
        System.out.println("Hiển thị các số nguyên tố nhỏ hơn 100");
        int i;
        int j;
        int count;
        for (i = 2; i < 100; i++) {
            count = 0;
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
