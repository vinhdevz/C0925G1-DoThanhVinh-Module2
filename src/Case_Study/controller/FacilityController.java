package Case_Study.controller;
import java.util.Scanner;

public class FacilityController {
    Scanner scanner = new Scanner(System.in);

    public void menuFacility() {
        while (true) {
            System.out.println("------ FACILITY MANAGEMENT ------");
            System.out.println("1. Display facility list");
            System.out.println("2. Add new facility");
            System.out.println("3. Display maintenance list");
            System.out.println("4. Return main menu");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    menuAddFacility();
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

    private void menuAddFacility() {
        while (true) {
            System.out.println("---- ADD NEW FACILITY ----");
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Return");
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
