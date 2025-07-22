package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\nSimple To-Do-List-App");
            System.out.println("1. Add a Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete a Task");
            System.out.println("4. Exit");
            System.out.println("Choose an option (1-4):");

            int choose = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            if (choose == 1) {
                System.out.println("Enter Your Task:");
                String task = sc.nextLine();
                tasks.add(task); // corrected from task.add(task)
                System.out.println("Task Added Successfully");

            } else if (choose == 2) { // fixed from "elseif"
                if (tasks.isEmpty()) {
                    System.out.println("No Task Found");
                } else {
                    System.out.println("Your Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }

            } else if (choose == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("Nothing to Delete");
                } else {
                    System.out.println("Enter Task Number to Delete:");
                    int tasknum = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (tasknum >= 1 && tasknum <= tasks.size()) {
                        tasks.remove(tasknum - 1);
                        System.out.println("Task Deleted");
                    } else {
                        System.out.println("Invalid Number");
                    }
                }

            } else if (choose == 4) {
                System.out.println("GoodBye !!");
                break;

            } else {
                System.out.println("Please choose a valid option");
            }
        }

        sc.close();
    }
}