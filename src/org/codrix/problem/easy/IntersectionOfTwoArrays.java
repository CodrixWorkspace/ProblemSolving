package org.codrix.problem.easy;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] found(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();  //remove duplicate when storing
        HashSet<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);  //4,9,5
        }

        for (int n : nums2) {  // check for common elements  and add to set2
            if (set1.contains(n))
                set2.add(n); //4,9
        }

        //converting to array
        int [] result = new int[set2.size()]; //2
        int index = 0;
        for (int n : set2){
            result[index++] = n; //4,9
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = found(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
