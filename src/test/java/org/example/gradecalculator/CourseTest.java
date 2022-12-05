package org.example.gradecalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @DisplayName("과목을 생성한다.")
    @Test
    void create_course() throws Exception {
        assertDoesNotThrow(() -> new Course("OOP", 3, "A+"));
    }
}