package DSA.bai_tap.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    //thuoc tinh
    //size xác định số phần tử trong danh sách, mặc định gán là 0.
    //DEFAULT_CAPACITY lưu số phần tử đối đa trong danh sách mặc định là 10.
    //Mảng đối tượng elements chứa các phần tử trong danh sách
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    //Các phương thức:
    //Phương thức khởi tạo không tham số
    //Sức chứa mặc định khi khởi tạo bằng Constructor không có tham số
    public MyList() {

        elements = new Object[DEFAULT_CAPACITY];
    }
    public int size() {
        return size;
    }
    //Tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //thêm một phần tử vào cuối của danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    // trả về phần tử vừa ở vị trí thứ i trong danh sách.
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    //phần tử có trong danh sách không
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
    //remove phần tử
}
