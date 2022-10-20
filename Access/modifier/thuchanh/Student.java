package Access.modifier.thuchanh;

public class Student {
    //Xây dựng lớp Student, xây dựng phương thức tĩnh change()
    private int rollno;
    private String name;
    private static String college = "BBIDT";
    //constructor

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //phương thức static để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

//Xây dựng lớp TestStaticMethod, trong lớp này sẽ gọi đến phương thức static thông qua lớp
class TestStaticMethod {
    public static void main(String args[]) {
        // gọi phương thức
        Student.change();
        //// tạo đối tượng
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        // gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}

