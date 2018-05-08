package nl.capgemini.volleybal.controller;

import nl.capgemini.volleybal.utils.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {


    @InjectMocks
    private CalculatorController calculatorController;

    @Mock
    private Calculator calculator;

    @Test
    public void testAdd() {

        Mockito.when(this.calculator.add(3, 4)).thenReturn(7);

        Assert.assertEquals(7, this.calculatorController.add(3, 4));
        Assert.assertEquals(7, this.calculatorController.add(3, 4));

        Mockito.verify(this.calculator, Mockito.times(2)).add(3,4);
    }
}


