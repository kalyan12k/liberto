
package demo;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
public class AllList {
	class ArrayListExample extends AllList {

	public void AL() {	
		ArrayList<String> names=new ArrayList<String>();	
		names.add("a");
		names.add("b");
		names.add("c");
		System.out.println(names);
		}
	}
	class LinkedListExample extends AllList {

	public void ll() {
		LinkedList<String> names=new LinkedList<String>();
		names.add("a");
		names.add("b");
		names.add("c");
		System.out.println(names);
	}
	}
	class HashSetExample extends AllList {

	public void HS() {
		HashSet<String>names = new HashSet<String>();
		names.add("d");
		names.add("e");
		names.add("f");
		System.out.println(names);
}
	}
	class HashMapExample extends AllList {

	public void HM() {
		HashMap<Integer,String> names = new HashMap<Integer,String> ();
		names.put(1,"a");
		names.put(2,"b");
		names.put(3,"c");
		System.out.println(names);
} 
	}
	public static void main(String[] args) {
		AllList sc = new AllList();
		ArrayListExample obj1 = sc.new ArrayListExample();
		obj1.AL();
		LinkedListExample obj2 =sc. new LinkedListExample();
		obj2.ll();
		HashSetExample obj3 = sc.new HashSetExample();
		obj3.HS();
		HashMapExample obj4 = sc.new HashMapExample();
		obj4.HM();
	}
}
