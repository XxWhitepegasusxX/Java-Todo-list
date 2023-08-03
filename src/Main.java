import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    static List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("O que gostaria de fazer: ");
            System.out.println("1 - Read to-do list");
            System.out.println("2 - Add to-do");
            System.out.println("3 - Remove to-do");
            System.out.println("4 - Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    readToDoList();
                    break;
                case 2:
                    addToDoList();
                    break;
                case 3:
                    removeToDoList();
                    break;
                case 4:
                    System.out.println("Closing...");
                    sc.close();
                    return;
                default:
                    System.out.println("Insira uma opcao valida");
                    break;
            }
        }
    }

    public static void readToDoList(){
        System.out.println("====== To do List =====");
        for (int i = 0; i < toDoList.size(); i++) {
            int number = i + 1;
            System.out.println(number + " - " + toDoList.get(i));
        }
        System.out.println("=======================");

    }

    public static void addToDoList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your task: ");
        String taskName = sc.nextLine();
        toDoList.add(taskName);
    }

    public static void removeToDoList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the task number to remove");
        for (int i = 0; i < toDoList.size(); i++) {
            int number = i + 1;
            System.out.println(number + " - " + toDoList.get(i));
        }
        int taskNumber = sc.nextInt();
        if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
            toDoList.remove(taskNumber - 1);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}