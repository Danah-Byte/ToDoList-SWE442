/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;


import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== MY TO-DO LIST =====");
            System.out.println("1. Add Task");
System.out.println("2. View Tasks");
System.out.println("3. Delete Task");
System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = input.nextLine();

                    tasks.add(task);

                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\nYour Tasks:");

                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
    if (tasks.isEmpty()) {
        System.out.println("No tasks to delete.");
    } else {
        System.out.println("Enter task number to delete:");
        int taskNumber = input.nextInt();
        input.nextLine();

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }
    break;

case 4:
    System.out.println("Goodbye!");
    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }
}
