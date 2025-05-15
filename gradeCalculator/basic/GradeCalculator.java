package org.study.gradeCalculator.basic;

/**
 * @author rua
 */

//성적 관리 메인 실행 클래스
//기능: 이름, 국어/영어/수학 점수를 입력받고 총점, 평균, 등급(A/B/C 등)을 출력
public class GradeCalculator {
    public static void main(String[] args) {
        Student Red = new Student(90, 100, 80);
        System.out.println("Red의 평균 점수는 : "+Red.getAverage()+"점 입니다.");
        System.out.println("Red의 등급은 : "+Red.getGrade()+" 입니다.");
    }
}
