package org.codrix.problem.easy;

import java.util.Arrays;

// 26. Remove Duplicates from Sorted Array - Lokesh
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicate {

    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();

        // Example usage
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicate.removeDuplicates(nums);
        System.out.println("Count of unique elements: " + length);
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(nums, length)));
    }

    public int removeDuplicates(int[] nums) {
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

    public int removeDuplicatesTwoPointer(int[] nums) {
        int insertPointer = 1;
        if (nums.length == 1)
            return insertPointer;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertPointer] = nums[i];
                insertPointer++;
            }
        }
        return insertPointer;
    }
}
