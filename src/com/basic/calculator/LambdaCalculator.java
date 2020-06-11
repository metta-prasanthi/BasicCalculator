package com.basic.calculator;

public class LambdaCalculator {

    @FunctionalInterface
	interface Op{
		double perform(double a, double b);
	}
	
	public double operate(double a, double b, Op op) {
		return op.perform(a, b);
    }
    
    public double add() {
		Op add = (a,b) -> a+b;
        System.out.println(" Add (25.0, 25.0) : "+ operate(25.0,25.0, add));
        return operate(25.0,25.0, add);
	}
   
    public double subtract() {
		Op subtract = (a,b) -> a-b;
        System.out.println(" Add (50.0, 25.0) : "+ operate(50.0,25.0, subtract));
        return operate(50.0,25.0, subtract);
    }
    
    public double multiply() {
		Op multiply = (a,b) -> a*b;
        System.out.println(" Add (25.0, 25.0) : "+ operate(25.0,25.0, multiply));
        return operate(25.0,25.0, multiply);
    }
    
    public double divide() {
		Op divide = (a,b) -> (b==0)?a:a/b;
        System.out.println(" Add (25.0, 25.0) : "+ operate(25.0,25.0, divide));
        return operate(25.0,25.0, divide);
	}
}