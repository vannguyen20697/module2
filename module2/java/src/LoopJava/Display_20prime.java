package LoopJava;

public class Display_20prime {
    public static void main(String[] args) {
        System.out.println("Hiển thị 20 chữ số nguyên tố đầu tiên");
        int i = 2;
        int count = 0;
        int prime;
        while (count <= 20) {
            prime = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = 0;
                }
            }
            if (prime == 1) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}

