
package demo;
import java.util.HashSet;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String>players = new HashSet<String>();
		players.add("a");
		players.add("b");
		players.add("c");
		players.add("d");
		players.add("d");
		System.out.println(players);
	}

}
