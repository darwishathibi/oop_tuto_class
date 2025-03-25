package com.other;

public class Mathutils {

    private static int operationCount = 0;

    //static method
    public static int square(int num) {
        operationCount++;
        return num * num;
    }

    //static method
    public static int cube(int num) {
        operationCount++;
        return num * num * num;
    }

    //static method to get the operation count
    public static int getOperationCount() {
        return operationCount;
    }

    //static nested class
    public static class Factorial {

        //static method
        public static int factorial(int num) {
            operationCount++;
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("Square of 5: " + square(5));
        System.out.println("Cube of 5: " + cube(5));
        System.out.println("Factorial of 5: " + Factorial.factorial(5));
        System.out.println("Operation count: " + getOperationCount());

        //static nested class can be accessed using the outer class name
        System.out.println("Factorial of 6: " + Mathutils.Factorial.factorial(6));
        System.out.println("Operation count: " + Mathutils.getOperationCount());
    }
}
