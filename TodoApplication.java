package todolist;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoApplication {
    private ArrayList<Tasks> displayList;
    private Scanner scanner;
    public TodoApplication() {
        displayList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    

    

    private void addTasks(int num, String name, String desc, LocalDate startDate, LocalDate dueDate){
        Tasks t = new Tasks(num, name, desc, startDate, dueDate);
        displayList.add(t);
        System.out.println("Tasks are added");        
    }

    private void viewTasks(){
        if(displayList.isEmpty()){
            System.out.println("No tasks available to display");
        }
        else{
            for(Tasks taskItem: displayList ){
                System.out.println(taskItem.toString());
            }
        }
    }

    private void removeTasks(int num){
        if(num >= 0 && num < displayList.size()){
            displayList.remove(num);
            System.out.println("Removed successfully");
        }
        else{
            System.out.println("Num not available to remove");
        }
    }

    public void showMenu() {
        System.out.println("===== To-Do List =====");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void run() {
        int choice = 1;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer input
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            switch (choice) {
                case 1:
                    System.out.print("Enter task serial number: ");
                    int num = scanner.nextInt();
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();
                    System.out.print("Enter start date: ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();
                    addTasks(num,name,desc,LocalDate.parse(startDate,formatter),LocalDate.parse(dueDate,formatter));
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    System.out.print("Enter the index of the task to remove: ");
                    int taskIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character after reading the integer input
                    removeTasks(taskIndex - 1); // Subtract 1 to adjust for 0-based indexing
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        TodoApplication toDoList = new TodoApplication();
        toDoList.run();
    }

    
    
}
