package org.codrix.problem.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/two-out-of-three/


public class TwoOutOfThree {
    public static void main(String[] args) {
        TwoOutOfThree solution = new TwoOutOfThree();

        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};

        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);
        System.out.println("Output for Example 1: " + result);

        int[] nums4 = {3, 1};
        int[] nums5 = {2, 3};
        int[] nums6 = {1, 2};

        List<Integer> result2 = solution.twoOutOfThree(nums4, nums5, nums6);
        System.out.println("Output for Example 2: " + result2);

        int[] nums7 = {1, 2, 2};
        int[] nums8 = {4, 3, 3};
        int[] nums9 = {5};

        List<Integer> result3 = solution.twoOutOfThree(nums7, nums8, nums9);
        System.out.println("Output for Example 3: " + result3);
    }

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> countMap = new HashMap<>();

        addToMap(countMap, nums1);
        addToMap(countMap, nums2);
        addToMap(countMap, nums3);

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    private void addToMap(Map<Integer, Integer> map, int[] nums) {
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
}
