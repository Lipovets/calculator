package com.calc.calculator;

import com.calc.operation.Operation;

public interface Calculator {

    double calculate(Operation operation, double x, double y);
}
