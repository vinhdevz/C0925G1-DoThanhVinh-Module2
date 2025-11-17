package Case_Study.controller;
import java.util.Scanner;

public class PromotionController {
    Scanner scanner = new Scanner(System.in);

    public void menuPromotion() {
        while (true) {
            System.out.println("------ PROMOTION MANAGEMENT ------");
            System.out.println("1. Display customers use service this year");
            System.out.println("2. Display customers receive voucher");
            System.out.println("3. Return main menu");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
            }
        }
    }
}
