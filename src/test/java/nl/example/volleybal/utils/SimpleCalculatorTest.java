package nl.example.volleybal.utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    public SimpleCalculatorTest() {
        // this takes a lot of time to make ...
        this.calculator = new SimpleCalculator();
        System.out.println("Constructor invoked of the SimpleCalculatorTest");
    }

    @Test
    public void testAdd() {
        int actual = this.calculator.add(3, 4);

        Assertions.assertEquals(7, actual);
    }

    @Test
    public void testPow() {
        int actual = this.calculator.pow(2, 3);

        Assertions.assertEquals(8, actual);
    }

    @Test
    public void testPow2() {
        Assertions.assertEquals(25, this.calculator.pow(5,2));
    }
}
