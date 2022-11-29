package Xu_ly_ngoai_le.bai_tap;

import java.util.Scanner;

public class TriangleSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh thứ 1 của tam giác: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh thứ 2 của tam giác");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh thứ 3 của tam giác");
            int c = Integer.parseInt(scanner.nextLine());
            SideCheck(a, b, c);
//            Check(a, b, c);
        } catch (ArithmeticException e) {
            System.out.println("Loi1: Canh khong la so am");
//        } catch (SideException e) {
//            System.out.println(e.getMessage());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Loi2: Tam giac khong hop le!");
        }
    }

//    public static void Check(int x, int y, int z) throws SideException {
//        if (x <= 0 && y <= 0 && z <= 0) {
//            throw new SideException("Loi: Canh tam giac khong ton tai");
//        } else {
//            System.out.println("Hop le");
//        }
//    }

    public static void SideCheck(int x, int y, int z) throws IllegalTriangleException {
        if (x + y <= z || x + z <= y || y + z <= x) {
            throw new IllegalTriangleException("Loi3: Tam giac khong hop le!");
        } else {
            System.out.println("Tamgiac hop le!");
        }
    }
}

class IllegalTriangleException extends Exception {
    IllegalTriangleException(String mess) {
        super(mess);
    }
}

class SideException extends Exception {
    SideException(String m) {
        super(m);
    }
}