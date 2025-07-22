package demo;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String romanStr = "MCMXCIV";  // Example input
        int number = sol.romanToInt(romanStr);

        System.out.println("Roman Numeral: " + romanStr);
        System.out.println("Integer: " + number);
    }
}