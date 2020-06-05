package com.basic.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class BasicCalc {
    static Calculator calc = new Calculator();

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
    }
}