package demo;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> burgerStack=new Stack<String>();
		burgerStack.push("Burger 1");
		burgerStack.push("Burger 2");
		burgerStack.push("Burger 3");
		System.out.println("Top burger is "+ burgerStack.peek());
		System.out.println("Serving "+burgerStack.pop());
		if(burgerStack.isEmpty()) {
			System.out.println("All burgers are served");
		}
	}

}
