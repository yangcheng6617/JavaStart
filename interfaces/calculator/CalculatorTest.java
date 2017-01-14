package interfaces.calculator;

import interfaces.calculator.Calculator;
import interfaces.calculator.CalculatorMul;
import interfaces.calculator.CalculatorSum;

/**
 * Created by Administrator on 2017/1/12.
 */
public class CalculatorTest {
    public static void main(String []args){
        Calculator p = new CalculatorSum();
        Calculator p1 = new CalculatorMul();

        float []nums = {1,2,4};
        System.out.println(p.op(nums));
        System.out.println(p1.op(nums));



    }
}
