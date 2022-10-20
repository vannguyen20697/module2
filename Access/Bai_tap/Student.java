package Access.Bai_tap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.toString());
        Student student2 = new Student();
        student1.setName("Nanon");
        student1.setClasses("Gifted");
        System.out.println(student1.toString());
    }
}
