package org.codrix;

//https://leetcode.com/problems/sum-of-two-integers/
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b; // Calculate carry using AND operator
            a = a ^ b; // Calculate sum using XOR operator
            b = carry << 1; // Shift carry to the left by 1 position
        }
        return a;
    }

    public static void main(String[] args) {
        SumOfTwoIntegers solution = new SumOfTwoIntegers();

        // Example 1
        int a1 = 1, b1 = 2;
        System.out.println("Sum of " + a1 + " and " + b1 + " is: " + solution.getSum(a1, b1)); // Output: 3

        // Example 2
        int a2 = 2, b2 = 3;
        System.out.println("Sum of " + a2 + " and " + b2 + " is: " + solution.getSum(a2, b2)); // Output: 5
    }
}
