package Case_Study.controller;
import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        while (true) {
            System.out.println("======= FURAMA MANAGEMENT =======");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    new EmployeeController().menuEmployee();
                    break;
                case 2:
                    new CustomerController().menuCustomer();
                    break;
                case 3:
                    new FacilityController().menuFacility();
                    break;
                case 4:
                    new BookingController().menuBooking();
                    break;
                case 5:
                    new PromotionController().menuPromotion();
                    break;
                case 6:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}
