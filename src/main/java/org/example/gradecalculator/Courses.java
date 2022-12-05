package org.example.gradecalculator;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double getTotalGradeToNumber() {
        return courses.stream()
                .mapToDouble(Course::calcualteTotalGrade)
                .sum();
    }

    public int getTotalCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
