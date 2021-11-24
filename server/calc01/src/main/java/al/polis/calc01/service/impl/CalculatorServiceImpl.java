package al.polis.calc01.service.impl;

import al.polis.calc01.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double sum(double a, double b) {
        System.out.println("Entered the service");
        return a + b;
    }

}
