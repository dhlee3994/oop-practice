package org.example.calculator.v2;

import org.example.calculator.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 0으로 나누는 경우 IllegalArgumentException 예외가 발생한다.
 * MVC패턴 기반으로 구현한다.
 */
class CalculatorV2Test {
    @DisplayName("사칙연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void operate(int operand1, String operator, int operand2, int result) throws Exception {
        assertEquals(result, CalculatorV2.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2)));
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                Arguments.arguments(2, "+", 2, 4),
                Arguments.arguments(1, "-", 2, -1),
                Arguments.arguments(3, "*", 2, 6),
                Arguments.arguments(4, "/", 2, 2)
        );
    }
}