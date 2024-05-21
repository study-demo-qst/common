package com.example.common;

/**
 * This utility class provides calculation related methods.
 */
public class CalcUtil {

    /**
     * Returns the power of a number.
     *
     * @param a the base number
     * @param b the exponent
     * @return the result of a raised to the power of b
     */
    public static double power(int a, int b) {
        return Math.pow(a, b);
    }

    /**
     * Returns the difference of two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the difference of a and b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Returns the product of two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns the quotient of two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the quotient of a and b
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}