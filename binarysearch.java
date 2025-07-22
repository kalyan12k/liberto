
package demo;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        boolean found = false;
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " found at index: " + position);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}
