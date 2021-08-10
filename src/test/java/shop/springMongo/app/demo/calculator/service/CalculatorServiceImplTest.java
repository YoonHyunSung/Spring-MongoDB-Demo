package shop.springMongo.app.demo.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
//import org.junit.runner.RunWith;

import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.jupiter.api.Assertions.*;
//@ExtendWith(MockitoExtension.class)
@SpringBootTest
//@RunWith(SpringRunner.class)
class CalculatorServiceImplTest {
    @MockBean
    CalculatorServiceImpl calculatorService;


    @Test
    void createRandomNumber() {
//        given(calculatorService.createRandomNumbers().willReturn(30));
        assertThat(calculatorService.createRandomNumbers()).isEqualTo(30);
    }
}