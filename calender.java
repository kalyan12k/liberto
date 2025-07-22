
package demo;
import java.util.*;
public class Calender {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day:");
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday":
			System.out.println("Let's learn python");
			break;
		case "tuesday":
			System.out.println("Let's learn java");
			break;
		case "wednesday":
			System.out.println("Let's learn c");
			break;
		case "thursday":
			System.out.println("Let's learn cpp");
			break;
		case "friday":
			System.out.println("Let's learn oracle");
			break;
		case "saturday":
			System.out.println("Let's learn ruby");
			break;
		case "sunday":
			System.out.println("Let's learn javascript");
			break;
		default:
			System.out.println("Choose correct option");
			break;
		}
		sc.close();
	}

		
		  
		
	}
