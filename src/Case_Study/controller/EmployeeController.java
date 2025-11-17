package Case_Study.controller;
import java.util.Scanner;

public class EmployeeController {
    Scanner scanner = new Scanner(System.in);

    public void menuEmployee() {
        while (true) {
            System.out.println("------ EMPLOYEE MANAGEMENT ------");
            System.out.println("1. Display employee list");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}
