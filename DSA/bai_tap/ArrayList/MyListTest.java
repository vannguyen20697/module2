package DSA.bai_tap.ArrayList;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList testList = new MyList();
        testList.add(1);
        testList.add(3);
        testList.add(5);
        testList.add(7);
        for (int i = 0 ; i < testList.size();i++){
            System.out.println(testList.get(i) + "\t");
        }
        System.out.println("phần tử có trong mảng không: " + testList.indexOf(6));
        System.out.println("Lấy phần tử: " + testList.get(2));
        System.out.println("Size của arraylist: " + testList.size());
    }
}
