package org.study.Association;

/**
 * @author rua
 */
public class AssociationExample {
    public static void main(String[] args) {
        Student s1 = new Student("A");
        Student s2 = new Student("B");
        Student s3 = new Student("B");

        Course c1 = new Course("자바");
        Course c2 = new Course("데이터베이스");
        Course c3 = new Course("파이썬");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);
        s2.enroll(c3);
        s3.enroll(c2);
        s3.enroll(c3);

        s1.printCourses();
        s2.printCourses();

        c1.printStudent();
        c2.printStudent();
        c3.printStudent();
    }
}
