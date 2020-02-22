package com.calc.operation;

import java.util.function.BinaryOperator;

public interface Operation {

    String getCode();

    String getName();

    BinaryOperator<Double> getOperationRule();

}
