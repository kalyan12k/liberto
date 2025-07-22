
package demo;

import java.util.*;

public class AdvancedGraph {
    static class Graph {
        private Map<Integer, List<Integer>> adjList = new HashMap<>();

        void addEdge(int u, int v) {
            adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u); // for undirected graph
        }

        void printGraph() {
            for (int node : adjList.keySet()) {
                System.out.print("Node " + node + " is connected to: ");
                for (int neighbor : adjList.get(node)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.printGraph();
    }
}
