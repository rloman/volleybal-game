package nl.capgemini.volleybal.utils;

import org.springframework.stereotype.Component;

@Component
public class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
       return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }


}
