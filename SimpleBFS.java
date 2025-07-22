package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SimpleBFS {

	    public static void main(String[] args) {
	        Map<String, List<String>> house = new HashMap<>();

	        house.put("Living Room", Arrays.asList("Kitchen", "Bedroom", "Study Room"));
	        house.put("Kitchen", Arrays.asList("Bathroom"));
	        house.put("Study Room", new ArrayList<>());
	        house.put("Bathroom", new ArrayList<>());
	        house.put("Bedroom", new ArrayList<>()); 
	        house.put("Balcony", new ArrayList<>()); 

	        System.out.println("Exploring the house using BFS starting from Living Room:");											
	        bfs(house, "Living Room");
	    }

	    public static void bfs(Map<String, List<String>> house, String startRoom) {
	        Queue<String> queue = new LinkedList<>();
	        Set<String> visited = new HashSet<>();

	        queue.add(startRoom);
	        visited.add(startRoom);

	        while (!queue.isEmpty()) {
	            String currentRoom = queue.poll();
	            System.out.println("Visited keerthi"  +  currentRoom);

	            for (String neighbor : house.getOrDefault(currentRoom, new ArrayList<>())) {
	                if (!visited.contains(neighbor)) {
	                    queue.add(neighbor);
	                    visited.add(neighbor);
	                }
	            }
	        }
	    }
	}
