package org.codrix.problem.medium;

import org.junit.Test;

public class ZigZagConversion {

    public String convert(String s, int numRows) {

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;

        while (index < n) {
            //Go down
            for (int j = 0; j < numRows && index < n; j++) {
                sb[j].append(arr[index++]);
            }
            // Go up
            for (int j = numRows - 2; j > 0 && index < n; j--) {
                sb[j].append(arr[index++]);
            }
        }

        //Combine all stringBuilder into one
        StringBuilder result = sb[0];
        for (int i = 1; i < numRows; i++) {
            result.append(sb[i].toString());
        }
        return result.toString();

    }

    @Test
    public void ZigZag1() {
        ZigZagConversion solution = new ZigZagConversion();
        String nums1 = "PINALSIGYAHRPI";
        int rows = 3;
        String result = solution.convert(nums1, rows);
        System.out.println(result);
    }

    @Test
    public void ZigZag2() {
        ZigZagConversion solution = new ZigZagConversion();
        String nums2 = "PAYPALISHIRING";
        int rows = 4;
        String result = solution.convert(nums2, rows);
        System.out.println(result);
    }

    @Test
    public void ZigZag3() {
        ZigZagConversion solution = new ZigZagConversion();
        String nums3 = "A";
        int rows = 1;
        String result = solution.convert(nums3, rows);
        System.out.println(result);
    }
}
