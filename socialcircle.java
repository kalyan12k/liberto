 package demo;

import java.util.*;

public class SocialCircleDFS {

    private Map<String, List<String>> socialGraph = new HashMap<>();
    private Set<String> visited = new HashSet<>();
    private List<String> socialCircle = new ArrayList<>();
    public void addConnection(String person1, String person2) {
        socialGraph.computeIfAbsent(person1, k -> new ArrayList<>()).add(person2);
        socialGraph.computeIfAbsent(person2, k -> new ArrayList<>()).add(person1);
    }

    public void dfs(String person) {
        if (visited.contains(person)) return;

        visited.add(person);
        socialCircle.add(person);
        System.out.println("Visited: " + person);

        for (String friend : socialGraph.getOrDefault(person, new ArrayList<>())) {
            dfs(friend);
        }
    }

    public List<String> getSocialCircle(String startPerson) {
        visited.clear();
        socialCircle.clear();
        dfs(startPerson);
        return socialCircle;
    }

    public static void main(String[] args) {
        SocialCircleDFS network = new SocialCircleDFS();

        // Building the social network
        network.addConnection("Alice", "Bob");
        network.addConnection("Alice", "Charlie");
        network.addConnection("Bob", "David");
        network.addConnection("Eve", "Frank");

        System.out.println("Social Circle starting from Alice:");
        List<String> circle1 = network.getSocialCircle("Alice");
        System.out.println(circle1);

        System.out.println("\nSocial Circle starting from Eve:");
       List<String> circle2 = network.getSocialCircle("Eve");
        System.out.println(circle2);
    }
}