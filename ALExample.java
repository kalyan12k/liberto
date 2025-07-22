
package demo;

import java.util.ArrayList;

public class ALExample {

	public static void main(String[] args) {
		ArrayList<String> characters = new ArrayList<>();
		characters.add("Dora");
		characters.add("Bujji");
		characters.add("Tom");
		characters.add("Jerry");
		characters.add("Jackey");
		System.out.println(characters);
		characters.remove(1);
		System.out.println(characters);
		characters.set(1,"Benny");
		 System.out.println(characters);
		for(int i = 0;i<characters.size();i++) {
			System.out.println(characters.get(i));
			
		}
		
		
		
		
	}

}
