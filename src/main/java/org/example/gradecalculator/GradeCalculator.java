package org.example.gradecalculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculate() {
        double totalGradeToNumber = courses.getTotalGradeToNumber();
        int totalCredit = courses.getTotalCredit();
        return totalGradeToNumber / totalCredit;
    }
}
