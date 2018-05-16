package nl.capgemini.volleybal.controller;


import nl.capgemini.volleybal.utils.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    private Calculator calculator;


    @GetMapping
    public int add(int a, int b) {
        return this.calculator.add(a,b);
    }
}
