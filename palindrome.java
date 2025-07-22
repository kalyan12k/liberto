
package demo;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a word: ");
		        String original = sc.nextLine();
		        String reversed = "";

			        for (int i = original.length() - 1; i >= 0; i--) {
		            reversed += original.charAt(i);
		        }

		        if (original.equals(reversed)) {
		            System.out.println("Palindrome");
		        } else {
		            System.out.println("Not a palindrome");
		        }

		        sc.close();
		    }
		}


