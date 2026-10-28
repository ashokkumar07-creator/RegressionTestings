package org.example;

public class Main {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(25));
    }
}