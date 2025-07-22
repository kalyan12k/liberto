
package demo;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashSet;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<String>();		
		cities.add("Mumbai");
		cities.add("kerala");
		cities.add("manali");
		cities.add("mysur");
		System.out.println(cities);
		System.out.println(cities.get(0));
		cities.set(0,"chennai");
		System.out.println(cities);
		cities.remove(2);
		Collections.sort(cities);
		Collections.reverse(cities);
		if(cities.contains("Kerala")) {
			System.out.println("namae is exists");
		}
		System.out.println(cities);
	}
}
