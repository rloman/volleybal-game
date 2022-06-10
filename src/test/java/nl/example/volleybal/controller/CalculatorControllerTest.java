package nl.example.volleybal.controller;

import nl.example.volleybal.utils.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalculatorControllerTest {


    @InjectMocks
    private CalculatorController calculatorController;

    @Mock
    private Calculator calculator;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAdd() {
        Mockito.when(this.calculator.add(3,4)).thenReturn(7);
        Assertions.assertEquals(7, this.calculatorController.add(3, 4));
    }

    @Test
    public void testAdd2() {
        Mockito.when(this.calculator.add(3,3)).thenReturn(10);
        Assertions.assertEquals(10, this.calculatorController.add(3, 3));
    }

    @Test
    public void testAdd3() {
        Mockito.when(this.calculator.add(3,3)).thenReturn(6);
        Assertions.assertEquals(6, this.calculatorController.add(3, 3));
    }

    @Test
    public void testPower() {

        Mockito.when(this.calculator.pow(2,3)).thenReturn(8);
        String result = this.calculatorController.powerResult(2,3);

        Assertions.assertEquals("2 to the power of 3 results to 8", result);
    }
}


