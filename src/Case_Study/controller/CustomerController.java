package Case_Study.controller;
import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);

    public void menuCustomer() {
        while (true) {
            System.out.println("------ CUSTOMER MANAGEMENT ------");
            System.out.println("1. Display customer list");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
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
