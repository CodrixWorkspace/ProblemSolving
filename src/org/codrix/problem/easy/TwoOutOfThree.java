package org.codrix.problem.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

//https://leetcode.com/problems/two-out-of-three/

public class TwoOutOfThree {

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


    @Test
    public void test1TwoOutOfThree() {
        TwoOutOfThree solution = new TwoOutOfThree();
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};
        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);
        assertEquals(2, result.size());
    }

    @Test
    public void test2TwoOutOfThree() {
        TwoOutOfThree solution = new TwoOutOfThree();
        int[] nums1 = {3, 1};
        int[] nums2 = {2, 3};
        int[] nums3 = {1, 2};
        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);
        assertEquals(3, result.size());
//        assertArrayEquals(result, new int[]{1,2,3});

    }

    @Test
    public void test3TwoOutOfThree() {
        TwoOutOfThree solution = new TwoOutOfThree();
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {4, 3, 3};
        int[] nums3 = {5};

        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);
        assertEquals(0, result.size());
    }


}
