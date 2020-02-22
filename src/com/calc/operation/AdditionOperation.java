package com.calc.operation;

import java.util.function.BinaryOperator;

public class AdditionOperation implements Operation {

    @Override
    public String getCode() {
        return "+";
    }

    @Override
    public String getName() {
        return "Addition";
    }

    @Override
    public BinaryOperator<Double> getOperationRule() {
        return (p1, p2) -> p1 + p2;
    }
}
