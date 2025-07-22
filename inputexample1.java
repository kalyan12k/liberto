
package xyz;

import java.util.Scanner;

public class InputExample1 { 
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name:");
		String Name=sc.nextLine();
		System.out.println(Name+age);
		
		
		
	}

}
