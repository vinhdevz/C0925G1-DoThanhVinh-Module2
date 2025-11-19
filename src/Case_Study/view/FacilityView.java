package Case_Study.view;

import Case_Study.entity.*;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private final Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n====== FACILITY MANAGEMENT ======");
        System.out.println("1. Display facility list");
        System.out.println("2. Add new facility");
        System.out.println("3. Display maintenance list");
        System.out.println("4. Return to main menu");
        System.out.print("Choose: ");
        return readInt();
    }

    public int showAddMenu() {
        System.out.println("\n--- ADD NEW FACILITY ---");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back");
        System.out.print("Choose: ");
        return readInt();
    }

    public Facility createFacility(String code, String type) {
        System.out.println("\n=== ADD " + type.toUpperCase() + " (Code: " + code + ") ===");

        System.out.print("Service name: ");
        String name = sc.nextLine().trim();

        System.out.print("Usable area (m²): ");
        double area = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Rental cost/day (VND): ");
        double cost = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Max people: ");
        int people = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Rental type (Year/Month/Day/Hour): ");
        String rentalType = sc.nextLine().trim();

        return switch (type) {
            case "Villa" -> {
                System.out.print("Room standard: ");
                String standard = sc.nextLine().trim();
                System.out.print("Pool area (m²): ");
                double pool = Double.parseDouble(sc.nextLine().trim());
                System.out.print("Number of floors: ");
                int floors = Integer.parseInt(sc.nextLine().trim());
                Villa v = new Villa();
                v.setServiceCode(code);
                v.setServiceName(name);
                v.setUsableArea(area);
                v.setRentalCost(cost);
                v.setMaxPeople(people);
                v.setRentalType(rentalType);
                v.setRoomStandard(standard);
                v.setPoolArea(pool);
                v.setNumberOfFloors(floors);
                yield v;
            }
            case "House" -> {
                System.out.print("Room standard: ");
                String standard = sc.nextLine().trim();
                System.out.print("Number of floors: ");
                int floors = Integer.parseInt(sc.nextLine().trim());
                House h = new House();
                h.setServiceCode(code);
                h.setServiceName(name);
                h.setUsableArea(area);
                h.setRentalCost(cost);
                h.setMaxPeople(people);
                h.setRentalType(rentalType);
                h.setRoomStandard(standard);
                h.setNumberOfFloors(floors);
                yield h;
            }
            case "Room" -> {
                System.out.print("Free service: ");
                String free = sc.nextLine().trim();
                Room r = new Room();
                r.setServiceCode(code);
                r.setServiceName(name);
                r.setUsableArea(area);
                r.setRentalCost(cost);
                r.setMaxPeople(people);
                r.setRentalType(rentalType);
                r.setFreeService(free);
                yield r;
            }
            default -> null;
        };
    }

    public void displayList(Map<Facility, Integer> map) {
        System.out.println("\n=== FACILITY LIST ===");
        if (map.isEmpty()) System.out.println("Empty!");
        else map.forEach((f, c) -> System.out.println(f + " | Used: " + c + " times"));
    }

    public void displayMaintenance(Map<Facility, Integer> map) {
        System.out.println("\n=== NEED MAINTENANCE (≥5 times) ===");
        boolean has = false;
        for (var e : map.entrySet()) {
            if (e.getValue() >= 5) {
                System.out.println(e.getKey() + " | Used: " + e.getValue() + " times");
                has = true;
            }
        }
        if (!has) System.out.println("No facility needs maintenance!");
    }

    public void showSuccess(String msg) {
        System.out.println("SUCCESS → " + msg);
    }

    public void showError(String msg) {
        System.out.println("ERROR → " + msg);
    }

    private int readInt() {
        while (true) try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.print("Please enter a number: ");
        }
    }
}