package com.basic.calculator.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.basic.calculator.Calculator;

import org.junit.Test; 
  
public class testcalculator {  
    Calculator calc = new Calculator();

    @Test  
    public void testAdd(){  
        BigDecimal result = calc.add(new double[]{25,25,25,25,25});
        BigDecimal expected_result = BigDecimal.valueOf(125.0);
        assertEquals(result, expected_result);  
    }  

    @Test  
    public void testSubtract(){  
        BigDecimal result = calc.subtract(new double[]{25,5,5,5,5});
        BigDecimal expected_result = BigDecimal.valueOf(5.0);
        assertEquals(result, expected_result);  
    }  

    @Test  
    public void testMultiply(){  
        BigDecimal result = calc.multiply(new double[]{5,5,5,3,2});
        BigDecimal expected_result = BigDecimal.valueOf(750.0);
        assertEquals(result.setScale(1, BigDecimal.ROUND_HALF_EVEN), expected_result);  
    } 

    @Test  
    public void testDivide(){  
        BigDecimal result = BigDecimal.valueOf(calc.divide(new double[]{125,5,5}));
        BigDecimal expected_result = BigDecimal.valueOf(5.0);
        assertEquals(result, expected_result);  
    } 

    @Test  
    public void testSquareRoot(){  
        List<Double> result = calc.squareRoot(new double[]{9,16});
        List<Double> expected_result = Arrays.asList(3.0,4.0);
        assertEquals(result, expected_result);  
    } 

    @Test  
    public void testPow(){  
        BigDecimal result = BigDecimal.valueOf(calc.pow(3,2));
        BigDecimal expected_result = BigDecimal.valueOf(9.0);
        assertEquals(result, expected_result);  
    } 
}  