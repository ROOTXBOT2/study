package org.study.gradeCalculator.iterf;

/**
 * @author rua
 */

//학생 정보
public class Student implements GradeCalculable {
    int kscore;
    int mscore;
    int escore;
    char grade;

    protected Student(int kscore, int mscore, int escore) {
        this.kscore = kscore;
        this.mscore = mscore;
        this.escore = escore;
    }


    @Override
    public int getAverage(){
        int avg;
        avg = (kscore + mscore + escore)/3;
        return avg;
    }
    @Override
    public char getGrade(){
        int avg;
        avg = (kscore + mscore + escore)/3;
        grade = (avg >= 90) ? 'A' :
                (avg >= 80) ? 'B' :
                        (avg >= 70) ? 'C' : 'D';
        return grade;
    }
}
