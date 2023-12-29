package org.codrix.problem.easy;

//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo solution = new PowerOfTwo();

        int num1 = 1;
        int num2 = 16;
        int num3 = 3;

        System.out.println(num1 + " is power of two: " + solution.isPowerOfTwo(num1));
        System.out.println(num2 + " is power of two: " + solution.isPowerOfTwo(num2));
        System.out.println(num3 + " is power of two: " + solution.isPowerOfTwo(num3));
    }
}
