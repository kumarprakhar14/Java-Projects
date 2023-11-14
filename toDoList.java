import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

class toDoList {
    public static void main(String[] args) {
        ArrayList<String> todolist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            try {

                System.out.println("ToDO list menu\n");
                System.out.println("1.Add a new task");
                System.out.println("2.Remove a task");
                System.out.println("3.View the list");
                System.out.println("4.Exit the list");
                System.out.println();
                System.out.println("Enter your choice");
                int choice = sc.nextInt();
                sc.nextLine(); // consumes the buffer new line from the input

                switch (choice) {
                    case 1:
                        System.out.println("Enter the task to add");
                        String taskToAdd = sc.nextLine();
                        todolist.add(taskToAdd);
                        System.out.println("Task added successfully\n");
                        break;
                    case 2:
                        System.out.println("Enter the task to remove");
                        String taskToRemove = sc.nextLine();
                        if (todolist.contains(taskToRemove)) {
                            todolist.remove(taskToRemove);
                            System.out.println("Task removed successfully\n");
                        } else {
                            System.out.println("Task was not found\n");
                        }
                        break;
                    case 3:
                        System.out.println("The tasks are: ");
                        for (String task : todolist) {
                            System.out.println("-" + task);
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Exiting todo list. Thank You");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid input.Try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.Please enter a valid input.");
                sc.nextLine(); // consumes invalid input to avoid an infinite loop
            }

        }
        sc.close();
    }

}
