package org.codrix.problem.easy;

import org.junit.Test;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    @Test
    public void ValidParanthesis1() {
        ValidParanthesis solution = new ValidParanthesis();
        String nums1 = "()[]{}";
        Boolean result = solution.isValid(nums1);
        System.out.println(result);
    }

    @Test
    public void ValidParanthesis2() {
        ValidParanthesis solution = new ValidParanthesis();
        String nums1 = "()";
        Boolean result = solution.isValid(nums1);
        System.out.println(result);
    }

    @Test
    public void ValidParanthesis3() {
        ValidParanthesis solution = new ValidParanthesis();
        String nums1 = "((])[])[][";
        Boolean result = solution.isValid(nums1);
        System.out.println(result);
    }
}
