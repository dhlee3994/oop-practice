package org.example.calculator.v2.operator;

import org.example.calculator.PositiveNumber;

public interface NewArithmeticOperator {
    boolean support(final String operator);
    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}
