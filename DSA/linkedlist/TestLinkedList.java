package DSA.bai_tap.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            int id;
            private String name;
            public Student(){

            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(123,"Nanon");
        Student student2 = new Student(123,"Mixxiw");
        Student student3 = new Student(123,"Warwana");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        for (int i = 0; i < myLinkedList.size(); i++){
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }


    }
}
