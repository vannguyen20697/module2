package thuat_toan_tim_kiem.thuc_hanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ky tu");
        String inputString = scanner.nextLine().replaceAll("\\s", "");
        //mỗi ký tự tương ứng với 1 số nguyên trong bảng mã ASCII  gồm 255 ký tự
        int[] frequentChar = new int[255];                               //(1)
        for (int i = 0; i < inputString.length(); i++) {                  //(2)
            //Tìm ví trí tương ứng của ký tự trong bảng ASCII
            int ascii = inputString.charAt(i);                           //(3)
            //Tăng giá trị tần suất
            frequentChar[ascii] += 1;                                     //(4)
        }
        //Tìm ký tự có tần suất xuất hiện nhiều nhất
        int max = 0;                                                //(5)
        char character = 255;                                //(6)
        for (int j = 0; j < 255; j++) {                            //(7)
            if (frequentChar[j] > max) {                             //(8)
                max = frequentChar[j];                              //(9)
                character = (char) j;                               //(10)
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất là '" + character + "' với số lần " + max);
    }
}
//Tính độ phức tạp của thuật toán vừa triển khai
/*
Thời  gian thực hiện lệnh {1}là O(1)
Hai lệnh gán {3} và {4} đều tốn O(1) thời gian
Vòng lặp {2} thực hiện (n) lần, mỗi lần O(1)
=>do đó vòng lặp {2} tốn O((n).1) = O(n)  với  n là độ dài chuỗi ký tự
Thời  gian thực hiện lệnh {5} và {6} đều là O(1)
Hai lệnh gán {9} và {10} đều tốn O(1) thời gian
So sánh frequentChar[j] > max  cũng tốn O(1) thời gian
=>do đó lệnh {8} tốn O(1) thời gian
Vòng lặp {7} thực hiện (255) lần, mỗi lần O(1) do đó vòng lặp {7} tốn O((255).1) = O(255).
Độ phức tạp của thuật toán cũng chính là thời gian thực hiện chuỗi lệnh {1}, {2}, {5}, {6}, {7}

TH1: n <= 255
độ phức tạp của thuật toán  sẽ là thời gian thực hiện lệnh {7} và bằng O(255)

TH2: n> 255
độ phức tạp của thuật toán  sẽ là thời gian thực hiện lệnh {2} và bằng O(n)
 */