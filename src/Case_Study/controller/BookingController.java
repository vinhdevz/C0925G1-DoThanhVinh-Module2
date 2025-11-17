package Case_Study.controller;
import java.util.Scanner;

public class BookingController {
    Scanner scanner = new Scanner(System.in);

    public void menuBooking() {
        while (true) {
            System.out.println("------ BOOKING MANAGEMENT ------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display booking list");
            System.out.println("3. Create new contract");
            System.out.println("4. Display contract list");
            System.out.println("5. Return main menu");
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
                    break;
                case 5:
                    return;
            }
        }
    }
}
