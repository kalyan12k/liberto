package demo;

import java.util.TreeSet;

public class TSExample {
	public static void main(String[] args) {
		TreeSet<Integer>ids = new TreeSet<Integer>();
		ids.add(5002);
		ids.add(4998);
		ids.add(5005);
		ids.add(4999);
		ids.add(5001);
		System.out.println(ids);
		System.out.println(ids.first());
		System.out.println(ids.last());
		System.out.println(ids.higher(4999));
		System.out.println(ids.lower(5005));
		
		
	}

}