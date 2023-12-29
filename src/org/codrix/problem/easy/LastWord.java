package org.codrix.problem.easy;

import java.security.PublicKey;
import java.util.Arrays;

public class LastWord {
    public static void main(String[] args) {
        LastWord lastWord = new LastWord();
        String input = "fly me   to   the moon";
        int lengthOfLastWord = lastWord.lastWord(input);
        System.out.println("Length of last word in '" + input + "': " + lengthOfLastWord);
    }
    public int lastWord(String s) {
        int i = s.length() - 1;
        while (i >= 1 && s.charAt(i) == ' ')
            --i;
        final int lastIndex = i;
        while (i >= 0 && s.charAt(i) != ' ')
            --i;

        return lastIndex - i;
    }
}
