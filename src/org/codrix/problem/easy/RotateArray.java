package org.codrix.problem.easy;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        k %= nums.length;
        //        int k = 7; // If k is 7, rotating by 5 (nums.length) is equivalent to rotating by 2 (7 % 5)
        //         rotate(nums, k);
        // After rotating by 2 steps, the array becomes {4, 5, 1, 2, 3}


        // Get the length of the array
        int n = nums.length;

        // Reverse the entire array
        reverseNum(nums, 0, n - 1);

        // Reverse the first k elements
        reverseNum(nums, 0, k - 1);

        // Reverse the remaining elements after k
        reverseNum(nums, k, n - 1);

        return nums;
    }

    public static void reverseNum(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end positions
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move towards the center of the array
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] result = rotate(nums, k);

        // Print the result using Arrays.toString()
        System.out.println(Arrays.toString(result));
    }
}
