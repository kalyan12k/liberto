
package demo;

public class Calculator {
			int add(int a,int b) {
				return a+b;
			}
			double mul(double a,double b)
			{
				return a*b;
			}
			int add(int a,int b,int c) {
				return a+b+c;
			}
		public static void main(String[] args) {
			Calculator cal=new Calculator();
			System.out.println(cal.add(20,30));
			System.out.println(cal.mul(20,30));
			System.out.println(cal.add(20,30,40));		
		}

	}
