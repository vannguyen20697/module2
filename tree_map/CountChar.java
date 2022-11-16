package tree_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi muốn kiểm tra");
        String str = scanner.nextLine();
        //Chuyển chuỗi từ hoa sang thường
        // bỏ các space
        String newString = str.toLowerCase().replace(" ", "");
        Map<Character, Integer> map = new TreeMap<>();
        //containsKey() dùng để kiểm tra một Key có tồn tại
        //Nếu không tồn tại nó sẽ trả về false, ngược lại true.
        for (int i = 0; i < newString.length(); i++) {
            if (map.containsKey(newString.charAt(i))) {
                Integer count = map.get(newString.charAt(i));
                count++;
                map.replace(newString.charAt(i), count);
            } else {
                //put() để thêm các cặp key/value
                map.put(newString.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
