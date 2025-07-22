
package demo;

public class JumpSearch {
		    public static int jumpSearch(int[] arr, int target) {
		        int n = arr.length;
		        int step = (int) Math.floor(Math.sqrt(n));  
		        int prev = 0;

		        while (arr[Math.min(step, n) - 1] < target) {
		            prev = step;
		            step += Math.floor(Math.sqrt(n));
		            if (prev >= n)
		                return -1;
		        }

		        while (prev < Math.min(step, n)) {
		            if (arr[prev] == target)
		                return prev;
		            prev++;
		        }

		        return -1;
		    }

		    public static void main(String[] args) {
		        int[] arr = {3, 6, 9, 12, 15, 18, 21, 24, 27};  
		        int target = 18;

		        int index = jumpSearch(arr, target);

		        if (index != -1) {
		            System.out.println("Element found at index: " + index);
		        } else {
		            System.out.println("Element not found in the array.");
		        }
		    }
		}
