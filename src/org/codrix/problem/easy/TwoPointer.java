package org.codrix.problem.easy;

import java.util.Arrays;

// 26. Remove Duplicates from Sorted Array - Lokesh
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class TwoPointer {

    public static void main(String[] args) {
        TwoPointer twoPointer = new TwoPointer();

        // Example usage
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = twoPointer.twoPointer(nums);
        System.out.println("Count of unique elements: " + length);
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(nums, length)));
    }

    public int twoPointer(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
