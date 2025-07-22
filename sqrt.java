package demo;

import java.util.Scanner;

public class Sqrt {

    public static int squareRoot(int number) {
        int start = 0, end = number;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == number) {
                return mid; // Exact square root
            } else if (mid * mid < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        int number = scanner.nextInt();

        int result = squareRoot(number);
        System.out.println("Square root of " + number + " is " + result);

        scanner.close();
    }
}