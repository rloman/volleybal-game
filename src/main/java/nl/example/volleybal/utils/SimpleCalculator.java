package nl.example.volleybal.utils;

import org.springframework.stereotype.Component;

@Component
public class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
       return a+b;
    }

    @Override
    public int pow(int a, int b) {
        return (int) (Math.pow(a, b));
    }


}
