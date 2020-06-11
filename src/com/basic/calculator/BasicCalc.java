package com.basic.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class BasicCalc {
    static Calculator calc = new Calculator();
    static LambdaCalculator lambdaCalc = new LambdaCalculator();

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the argumnets and press enter: ");
        String[] scan = scanner.nextLine().split("\\s");

        scanner.close();

        double[] input = Arrays.stream(scan).mapToDouble(Double::parseDouble).toArray();
        System.out.println("Add : " + calc.add(input));
        System.out.println("Subtract : " + calc.subtract(input));
        System.out.println("Multiply : " + calc.multiply(input));
        System.out.println("Divide : " + calc.divide(input));

        //Math Functions
        System.out.println("Square Root : " + calc.squareRoot(input));
        System.out.println(input[0] + "raised to the power of " + input[1] + " : " + calc.pow(input[0], input[1]));

        //Math functions using Lamda expressions
        List<Double> inputList = DoubleStream.of(input).boxed().collect(Collectors.toList());

        System.out.println("Math operations Using Lambda expressions : ");

        Double addition = inputList.stream().reduce(0.0, (a, b) -> a + b);
        Double multiplication = inputList.stream().reduce(1.0, (a, b) -> a * b);
        Double subtraction = inputList.stream().reduce( (left,right) ->left - right).get();
        Double division = inputList.stream().reduce( (left,right) ->left / right).get();

        System.out.println("Add : " + addition);
        System.out.println("Subtract : " + multiplication);
        System.out.println("Multiply : " + subtraction);
        System.out.println("Divide : " + division);

        // Using Lambda Functions
        System.out.println("Math Functions Using Lambda : ");
        lambdaCalc.add();
        lambdaCalc.subtract();
        lambdaCalc.multiply();
        lambdaCalc.divide();
    }
}