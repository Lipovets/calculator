package com.client;

import com.calc.calculator.SimpleCalculator;
import com.calc.operation.AdditionOperation;
import com.calc.operation.SubtractionOperation;

public class Client {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println(calculator.calculate(new AdditionOperation(), 7,6));
        System.out.println(calculator.calculate(new SubtractionOperation(), 7,6));
    }
}


