package interfaces.calculator;

import interfaces.calculator.Calculator;

/**
 * Created by Administrator on 2017/1/12.
 */
public class CalculatorMul implements Calculator {
    public float op(float[] nums){
        float mul = 1;
        for (float num:nums){
            mul *= num;
        }
        return mul;
    }
}
