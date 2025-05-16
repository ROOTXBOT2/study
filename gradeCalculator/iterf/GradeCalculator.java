package org.study.gradeCalculator.iterf;

import java.util.Scanner;

/**
 * @author rua
 */
public class GradeCalculator {
    public static void main(String[] args) {
        int kscore,mscore,escore;
        String Name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 :");
        Name = scanner.nextLine();
        System.out.print("국어 점수 :");
        kscore = scanner.nextInt();

        System.out.print("수학 점수 :");
        mscore = scanner.nextInt();

        System.out.print("영어 점수 :");
        escore = scanner.nextInt();

        Student st = new Student(kscore, mscore, escore);
        System.out.println(Name+"의 평균 점수는 : "+st.getAverage()+"점 입니다.");
        System.out.println(Name+"의 등급은 : "+st.getGrade()+" 입니다.");
    }
}
