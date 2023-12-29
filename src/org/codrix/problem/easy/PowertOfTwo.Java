package org.codrix.problem.easy;

// https://leetcode.com/problems/power-of-two/

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}


public class PowerOfTwo {
    // Another implementation of isPowerOfTwo method
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int mask = 1 << 31;
        for (int i = 0; i < 31; i++) {
            if ((mask & n) != 0) {
                break;
            }
            mask = mask >>> 1;
        }
        return (n & (~mask)) == 0;
    }
}


public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                break;
            }
            n = n >>> 1;
        }
        n = n >>> 1;
        return n == 0;
    }
}