package shop.springMongo.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.springMongo.app.demo.calculator.entity.Calculator;
import shop.springMongo.app.demo.calculator.repository.CalculatorRepository;


@Service @RequiredArgsConstructor
public final class CalculatorServiceImpl implements CalculatorService {
    private final CalculatorRepository calculatorRepository;


    @Override
    public int createRandomNumbers() {
        return (int)(Math.random()*100)+1 ;
    }
}
