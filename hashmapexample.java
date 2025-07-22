
package demo;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> students = new HashMap<Integer,String> ();
		students.put(1,"Afreen");
		students.put(2, "Zara");
		students.put(3,"Suraj");
		students.put(4, "Niha");
		students.put(5, "Sana");
		System.out.println(students);
		students.remove(3);
		System.out.println(students);
		students.replace(1,"f");
		System.out.println(students);
		
	}

}
