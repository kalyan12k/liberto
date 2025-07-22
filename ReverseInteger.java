package demo;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            result = result * 10 + digit;
            x /= 10;
        }

        return result;
    }
public static void main(String[] args) {
    ReverseInteger ri = new ReverseInteger();
    
    int input = 123;    
    int reversed = ri.reverse(input);
    
    System.out.println("Input: " + input);
    System.out.println("Reversed: " + reversed);
}
}