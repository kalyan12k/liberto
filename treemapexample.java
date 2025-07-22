package demo;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> students= new TreeMap<>();
        students.put(1, "a");
        students.put(2, "s");
        students.put(3, "d");
        students.put(5, "w");

        System.out.println(students);
    }
}
 