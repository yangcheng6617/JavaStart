package interfaces.calculator;

import interfaces.calculator.Calculator;

/**
 * Created by Administrator on 2017/1/12.
 */
public class CalculatorSum implements Calculator {
    public float op(float[] nums){
        float sum = 0;
        for (float num:nums){
            sum += num;
        }
        return sum;

    }

    }


