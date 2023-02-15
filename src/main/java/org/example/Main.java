package org.example;

import org.example.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,6));
    }
}