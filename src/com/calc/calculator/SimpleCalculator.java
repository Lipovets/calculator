package com.calc.calculator;

import com.calc.operation.Operation;

public class SimpleCalculator implements Calculator {
    @Override
    public double calculate(Operation operation, double x, double y) {
        return operation.getOperationRule().apply(x, y);
    }
}
