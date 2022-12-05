package org.example.gradecalculator;

public class Course {

    private final String subject;
    private final int credit;
    private final String grade;

    public double calcualteTotalGrade() {
        return credit * getGradeToNumber();
    }

    private double getGradeToNumber() {
        if ("A+".equals(grade)) {
            return 4.5;
        } else if ("A".equals(grade)) {
            return 4.0;
        } else if ("B+".equals(grade)) {
            return 3.5;
        } else if ("B".equals(grade)) {
            return 3.0;
        } else if ("C+".equals(grade)) {
            return 2.5;
        } else if ("C".equals(grade)) {
            return 2.0;
        } else if ("D+".equals(grade)) {
            return 1.5;
        } else if ("D".equals(grade)) {
            return 1.0;
        } else if ("F".equals(grade)) {
            return 0.5;
        } else {
            throw new IllegalArgumentException("올바르지 않은 학점입니다.");
        }
    }

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public String getGrade() {
        return grade;
    }
}
