package org.example.gradecalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * 일급 컬렉션 사용
 */
class GradeCalculatorTest {

    @DisplayName("평균학점을 계산한다.")
    @Test
    void calculate() throws Exception {
        List<Course> courses = List.of(new Course("OOP", 3, "A"), new Course("자료구조", 3, "A"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double result = gradeCalculator.calculate();

        assertEquals(4.0, result);
    }

}