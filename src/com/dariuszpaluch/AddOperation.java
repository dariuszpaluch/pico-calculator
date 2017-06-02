package com.dariuszpaluch;

/**
 * Created by inf117225 on 02.06.2017.
 */
public class AddOperation implements Operation {

    @Override
    public double run(double a, double b) {
        return a + b;
    }

    @Override
    public boolean checkType(String type) {
        return type.equals("+");
    }
}
