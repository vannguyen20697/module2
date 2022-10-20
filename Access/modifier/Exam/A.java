package Access.modifier.Exam;

public class A {
    //Lớp A chứa thành viên dữ liệu private và phương thức private.
    public int data = 40;
    public void msg(){
        System.out.println("Hello Java");
    }
}
class Simple{
    public static void main(String args[]) {
        A obj = new A();
        /*Compile Time Error*/
        System.out.println(obj.data);
        /*Compile Time Error*/
        obj.msg();
    }
}
