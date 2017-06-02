package com.dariuszpaluch;

import java.util.List;

/**
 * Created by inf117225 on 02.06.2017.
 */
public class Calculator {
    final private Parser parser;
    final private List<Operation> operations;

    public Calculator(Parser parser, List<Operation> operations ) {
        this.parser = parser;
        this.operations = operations;
    }

    public double calculate(String mathAction) {
        MathOperation mathOperation = this.parser.parse(mathAction);
        double result = 0;
        System.out.println("SIZE" + operations.size());
        for(Operation operation : operations) {
            if(operation.checkType(mathOperation.type)) {
                result = operation.run(mathOperation.a, mathOperation.b);
            }
        }

        return result;

    };
}
