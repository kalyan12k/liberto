package demo;

public class RegularExpression {

    enum Result {
        TRUE, FALSE
    }

    static class Solution {
        Result[][] memo;

        public boolean isMatch(String text, String pattern) {
            memo = new Result[text.length() + 1][pattern.length() + 1];
            return dp(0, 0, text, pattern);
        }

        public boolean dp(int i, int j, String text, String pattern) {
            if (memo[i][j] != null) {
                return memo[i][j] == Result.TRUE;
            }
            boolean ans;
            if (j == pattern.length()) {
                ans = i == text.length();
            } else {
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));

                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    ans = (dp(i, j + 2, text, pattern) ||
                            (first_match && dp(i + 1, j, text, pattern)));
                } else {
                    ans = first_match && dp(i + 1, j + 1, text, pattern);
                }
            }
            memo[i][j] = ans ? Result.TRUE : Result.FALSE;
            return ans;
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        String text = "aab";
        String pattern = "c*a*b";

        boolean result = solution.isMatch(text, pattern);
        System.out.println("Does the text match the pattern? " + result);
    }
}