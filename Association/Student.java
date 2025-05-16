package org.study.Association;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rua
 */
public class Student {
    private List<Course> courses;
    private String name;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) { // 상호 참조 (양방향 연결)
        courses.add(course); //객체 주소가 바로 들어가서 학생이 듣는 수업으로 배열에 저장
        course.addStudent(this); //현재 학생의 인스턴스를 받은 객체 주소의 인스턴스에도 등록하기 위해 전달
    }

    public String getName(){
        return name;
    }

    public void printCourses(){
        System.out.println(this.name +" 수강생이 듣는 강의");
        for(Course c : courses){
            System.out.println(c.getName());
        }
    }

}
