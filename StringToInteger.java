package demo;
public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading whitespace
        int sign = 1, i = 0;
        long res = 0; // Use long to detect overflow

        if (s.length() == 0) return 0;

        // Check for sign
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Process digits
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break;

            res = res * 10 + (ch - '0');

            // Handle overflow
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * res);
    }

    public static void main(String[] args) {
        StringToInteger parser = new StringToInteger();

        String[] testCases = {
            "42",
            "   -42",
            "4193 with words",
            "words and 987",
            "-91283472332",
            "+1",
            "",
            "   ",
            "2147483648",
            "-2147483649"
        };

        for (String test : testCases) {
            System.out.println("Input: \"" + test + "\" => Output: " + parser.myAtoi(test));
        }
    }
}