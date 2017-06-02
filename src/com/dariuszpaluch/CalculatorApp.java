package com.dariuszpaluch;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

/**
 * Created by inf117225 on 02.06.2017.
 */
public class CalculatorApp {

    public static void main(String...args){
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(Calculator.class);
        pico.addComponent(AddOperation.class);
        pico.addComponent(Parser.class);
        pico.addComponent(DevideOperation.class);

        Calculator calculator = pico.getComponent(Calculator.class);

        System.out.println("5+2= " + calculator.calculate("5+2"));
        System.out.println("5/2= " + calculator.calculate("5/2"));
    }
}
