package com.dariuszpaluch;

public class Parser {
    public MathOperation parse(String mathAction) {
        double a = Double.parseDouble(Character.toString(mathAction.charAt(0)));
        double b = Double.parseDouble(Character.toString(mathAction.charAt(2)));
        String type = Character.toString(mathAction.charAt(1));

        System.out.println(a);
        System.out.println(b);
       return new MathOperation(a,b, type);
    }
}
