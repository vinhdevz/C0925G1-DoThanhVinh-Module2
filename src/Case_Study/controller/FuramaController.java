package Case_Study.controller;

import Case_Study.service.*;
import java.util.Scanner;

public class FuramaController {

    private static final Scanner sc = new Scanner(System.in);

    private static final IEmployeeService employeeService = new EmployeeService();
    private static final ICustomerService customerService = new CustomerService();
    private static final IFacilityService facilityService = new FacilityService();
    private static final IBookingService bookingService = new BookingService();
    private static final IPromotionService promotionService = new PromotionService();

    public static void displayMainMenu() {
        while (true) {
            System.out.println("FURAMA RESORT MANAGEMENT");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Please choose (1-6): ");

            int choice = getChoice();

            switch (choice) {
                case 1 -> new EmployeeController(employeeService).menuEmployee();
                case 2 -> new CustomerController(customerService).menuCustomer();
                case 3 -> new FacilityController(facilityService).menuFacility();
//                case 4 -> new BookingController(bookingService, facilityService, customerService).menuBooking();
//                case 5 -> new PromotionController(bookingService, customerService).menuPromotion();
                case 6 -> {
                    System.out.println("\nThank you for using Furama System. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please enter number from 1 to 6.");
            }
        }
    }

    private static int getChoice() {
        while (true) {
            String input = sc.nextLine().trim();
            try {
                int num = Integer.parseInt(input);
                if (num >= 1 && num <= 6) {
                    return num;
                } else {
                    System.out.print("Please enter a number from 1 to 6: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter a number (1-6): ");
            }
        }
    }
}