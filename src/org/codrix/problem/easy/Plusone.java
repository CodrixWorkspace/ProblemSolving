package org.codrix.problem.easy;

import org.junit.Test;

public class Plusone {
    public int[] isValid(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }

    @Test
    public void Plusone1() {
        Plusone solution = new Plusone();
        int[] nums2 = {1, 2, 3};
        int[] result = solution.isValid(nums2);
        System.out.println(result);
    }

    @Test
    public void Plusone2() {
        Plusone solution = new Plusone();
        int[] nums3 = {9};
        int[] result = solution.isValid(nums3);
        System.out.println(result);
    }

    @Test
    public void Plusone3() {
        Plusone solution = new Plusone();
        int[] nums4 = {1, 2, 3};
        int[] result = solution.isValid(nums4);
        System.out.println(result);
    }
}
