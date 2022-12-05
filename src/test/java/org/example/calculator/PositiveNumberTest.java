package org.example.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PositiveNumberTest {

    @DisplayName("0 또는 음수로 초기화하는 경우 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void create(int value) throws Exception {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            new PositiveNumber(value);
        });

        assertEquals("0 또는 음수를 계산할 수 없습니다.", ex.getMessage());
    }
}