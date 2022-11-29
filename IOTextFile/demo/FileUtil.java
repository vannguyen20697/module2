package IOTextFile.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "C:\\codegym\\module2\\java\\src\\IOTextFile\\demo\\student.csv";

    public static List<Student> readCSV() throws IOException {
        List<Student> studentsList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String temp[];
        Student student;
        while ((line = buff.readLine()) != null) {
            temp = line.split(","); //tach chuoi
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            int age = Integer.parseInt(temp[2]);
            student = new Student(id, name, age);
            studentsList.add(student);
        }
        buff.close();
        return  studentsList;
    }
    public  static void writeCSV(Student student) throws IOException{
        FileWriter fileWriter =  new FileWriter(FILE_PATH, true);
        BufferedWriter buff   =  new BufferedWriter(fileWriter);
        buff.write(student.getId() + "," + student.getName() + "," + student.getAge() + "\n");
        buff.close();
    }

    public static void main(String[] args) throws IOException {
        List<Student> studentList = FileUtil.readCSV();
        for (Student student: studentList){
            System.out.println(student);
        }
//        FileUtil.writeCSV(new Student(11,"NHAN",30));
    }
}