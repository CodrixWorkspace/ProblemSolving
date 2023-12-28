package org.codrix.problem.easy;

//13. Roman to Integer - Jagan
//https://leetcode.com/problems/roman-to-integer/
//public class RomanToInteger {
//    public static void main(String[] args) {
//            String value="IIV";
//            char[] roman= value.toCharArray();
//            int prev=0;
//            int total=0;
//            for(int i=roman.length;i>=0;i--){
//                switch (roman[i]){
//                    case 'I':
//                        total+=1;
//                        continue;
//                    case 'V':
//                        total+=5;
//                        continue;
//                    case 'X':
//                        total+=10;
//                        continue;
//                    case 'L':
//                        total+=50;
//                        continue;
//                    case 'C':
//                        total+=100;
//                        continue;
//                    case 'D':
//                        total+=500;
//                        continue;
//                    case 'M':
//                        total+=1000;
//                        continue;
//                    default:
//                        continue;
//                }
//
//            }
//            System.out.println(total);
//    }
//
//}


import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);


    /*
    Input = XXVII
    result = 1

                    i   charAt(i)   val(charAt(i))    if||else    result
    Iteration 1     3       I              1           false       2
    Iteration 2     2       V              5           false       7
    Iteration 3     1       X              10          false       17
    Iteration 4     0       X              10          false       27

    * */

        int result = m.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (m.get(s.charAt(i)) < m.get((s.charAt(i + 1)))) {
                result -= m.get(s.charAt(i));
            } else {
                result += m.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "XXVII";
        int result = romanToInt(romanNumeral);
        System.out.println(result);
    }

}
