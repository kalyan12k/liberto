
package demo;
import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
	public static void main(String[] args) {
			Queue<String> icecream=new LinkedList<String>();
			icecream.add("kid 1");
			icecream.add("kid 2");
			icecream.add("kid 3");
			icecream.add("kid 4");
			icecream.add("kid 5");
			System.out.println(icecream);
			String firstOut=icecream.poll();
			System.out.println(firstOut);
			System.out.println(icecream);
			String firstin=icecream.remove();
			System.out.println(firstin);
			System.out.println(icecream);
			String first=icecream.remove();
			System.out.println(first);
			System.out.println(icecream);
			String ft=icecream.remove();
			System.out.println(ft);
			System.out.println(icecream);
			String f=icecream.remove();
			System.out.println(f);
			System.out.println(icecream);
		}

	}
