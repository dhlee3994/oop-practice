package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookTest {

    @DisplayName("음식을 생성한다.")
    @Test
    void create() throws Exception {
        assertDoesNotThrow(() -> {
            new Cook("돈까스", 5000);
        });
    }
}