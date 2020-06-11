package com.basic.calculator.test;

import static org.junit.Assert.*;

import com.basic.calculator.LambdaCalculator;

import org.junit.Test; 
  
public class testLambdaCalculator {  

    LambdaCalculator calc = new LambdaCalculator();

    @Test  
    public void testAdd(){  
        double result = 50.0;
        double actual = calc.add();
        assertEquals(Double.valueOf(result), Double.valueOf(actual)); 
    }  

    @Test  
    public void testSubtract(){  
        double result = 25.0;
        double actual = calc.subtract();
        assertEquals(Double.valueOf(result), Double.valueOf(actual));  
    }  

    @Test  
    public void testMultiply(){  
        double result = 625.0;
        double actual = calc.multiply();
        assertEquals(Double.valueOf(result), Double.valueOf(actual)); 
    } 

    @Test  
    public void testDivide(){  
        double result = 1.0;
        double actual = calc.divide();
        assertEquals(Double.valueOf(result), Double.valueOf(actual)); 
    } 
}  