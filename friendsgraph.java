
package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendsGraph {

	public static void main(String[] args) {
		Map<String,List<String>>graph = new HashMap<>();
		graph.put("Alice", Arrays.asList("Bob"));
		graph.put("Bob",Arrays.asList("Alice","Charlie"));
		graph.put("Charlie", Arrays.asList("Alice","Charlie"));
		graph.put("Charlie",Arrays.asList("Bob"));
		for(String person : graph.keySet()) {
			System.out.println(person + "is friends with" + graph.get(person));
		}
	}

}
