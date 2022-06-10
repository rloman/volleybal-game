package nl.example.volleybal.controller;


import nl.example.volleybal.utils.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private Calculator calculator;


    public int add(int a, int b) {
        return this.calculator.add(a,b);
    }

    public String powerResult(int a, int b) {

        String result = String.format("%d to the power of %d results to %d", a, b, this.calculator.pow(a,b));

        return result;

    }
}

