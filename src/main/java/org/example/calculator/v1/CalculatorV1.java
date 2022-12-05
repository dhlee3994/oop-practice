package org.example.calculator.v1;

import org.example.calculator.PositiveNumber;

public class CalculatorV1 {
    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return ArithmeticOperator.calculate(operand1.toInt(), operator, operand2.toInt());
    }
}
