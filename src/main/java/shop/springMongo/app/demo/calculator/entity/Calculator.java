package shop.springMongo.app.demo.calculator.entity;

import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class Calculator {
    @Id
    private long calculatorId;
    private int num1;
    private int num2;
    private int result;

    public Calculator(int num1, int num2){
        this.num1 =num1;
        this.num2 = num2;
        this.result = num1*num2;//사칙연산중 곱셈만.
    }
    @Override
    public String toString(){
        return String.format("%d * %d =%d",num1,num2,result);
    }
}
