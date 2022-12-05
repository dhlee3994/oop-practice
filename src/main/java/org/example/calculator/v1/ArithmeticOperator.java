package org.example.calculator.v1;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public enum ArithmeticOperator {
    ADDITION("+", (o1, o2) -> o1 + o2),
    SUBTRACTION("-", (o1, o2) -> o1 - o2),
    MULTIPLICATION("*", (o1, o2) -> o1 * o2),
    DIVISION("/", (o1, o2) -> {
        if (o2 == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        return o1 / o2;
    }),
    ;

    public static int calculate(final int num1, final String operator, final int num2) {
        ArithmeticOperator op = getOperator(operator);
        return op.expression.applyAsInt(num1, num2);
    }

    private static ArithmeticOperator getOperator(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }

    private final String operator;
    private final IntBinaryOperator expression;

    ArithmeticOperator(String operator, IntBinaryOperator expression) {
        this.operator = operator;
        this.expression = expression;
    }
}