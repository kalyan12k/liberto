package demo;

import java.util.Scanner;

public class SimpleCalculator {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter the first number:");
			double num1=input.nextDouble();
			
			System.out.println("Enter the second number:");
			double num2=input.nextDouble();
			
			System.out.println("Choose an operator(+,-,*,/):");
			char operator=input.next().charAt(0);
			
			double result;
			switch(operator) {
			case '+':
				result=num1+num2;
				System.out.println("Result:"+result);
				break;
			case '-':
				result=num1-num2;
				System.out.println("Result:"+result);
				break;
			case '*':
				result=num1*num2;
				System.out.println("Result:"+result);
				break;
			case '/':
				if(num2 !=0) {
				result=num1/num2;
				System.out.println("Result:"+result);
			}else {
				System.out.println("Error:Cannot Divide By Zero !");
			}
				break;
				default:
					System.out.println("Invalid Operator");
		}
			input.close();
	}
	}