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
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count>0){
                    return count;
            }
        }
    }
return count;
}
}
