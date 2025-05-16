package org.study.Association;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rua
 */
public class Course {
    private String name;
    private List<Student> students; // 이 수업을 듣는 학생 목록

    public Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void printStudent(){
        System.out.println(this.name +" 수강생이 듣는 강의");
        for(Student s : students){
            System.out.println(s.getName());
        }
    }

    public String getName() {
        return name;
    }

}
