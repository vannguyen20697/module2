package DSA.thuchanh.trienkhailList;

import java.util.Arrays;

public class MyList<E> {
    //Tạo lớp MyList với các thuộc tính như mô tả
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //Cài đặt phương thức ensureCapa()
    //Tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //thêm một phần tử vào cuối của danh sách
    //Tham số đầu vào: phần tử cần thêm vào danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    // Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
