package org.codrix.problem.easy;

import org.junit.Test;

import java.util.Arrays;


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

    @Test
    public void test1LongestCommonPrefix1() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] nums1 = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(nums1);
        System.out.println(result);
    }

    @Test
    public void test1LongestCommonPrefix2() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] nums1 = {"dog", "racecar", "car", "dok", "race", "cap"};
        String result = solution.longestCommonPrefix(nums1);
        System.out.println(result);
    }

}
