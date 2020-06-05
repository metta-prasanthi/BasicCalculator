package com.basic.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    BigDecimal result = BigDecimal.valueOf(0.0); 
    public BigDecimal add(double ...input){
        for (double i : input) {
            result = result.add(BigDecimal.valueOf(i));
        }
        return result;
  }
  public BigDecimal subtract(double ...input){
    result = BigDecimal.valueOf(0.0); 
    for (double i : input) {
        if (result.equals(BigDecimal.valueOf(0.0)))  {
            result = BigDecimal.valueOf(i);
        } else {
            result = result.subtract(BigDecimal.valueOf(i));
        }
    }
    return result;
  }
  public BigDecimal multiply(double ...input){
    result = BigDecimal.valueOf(1.0); 
    for (double i : input) {
        result = result.multiply(BigDecimal.valueOf(i));
    }
    return result;
  }
  public double divide(double ...input){
    double result = 0; 
    for (double i : input) {
        if (result == 0)  {
            result = i;
        } else {
            result = result / i;
        }
    }
    return result;
  }

  // Math functions
  public List<Double> squareRoot(double ...input){
    List<Double> result = new ArrayList<Double>();
    for (double i : input) {
        result.add(Math.sqrt(i));
    }
    return result;
  }

  public double pow(double a, double b) {
        return Math.pow(a, b);
    }
}