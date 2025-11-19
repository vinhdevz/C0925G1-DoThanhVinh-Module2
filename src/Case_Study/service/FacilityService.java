package Case_Study.service;

import Case_Study.entity.*;
import java.util.*;

public class FacilityService implements IFacilityService {

    private final Map<Facility, Integer> facilities = new LinkedHashMap<>();
    private int villaCount = 1, houseCount = 1, roomCount = 1;

    public FacilityService() {
        // DỮ LIỆU MẪU
        facilities.put(new Villa("SVVL-0001", "Villa Royal", 500, 20000000, 15, "Day", "VIP", 100, 3), 0);
        facilities.put(new House("SVHO-0001", "House Garden", 200, 8000000, 8, "Day", "Luxury", 2), 6);
        facilities.put(new Room("SVRO-0001", "Room Ocean", 50, 3000000, 4, "Day", "Breakfast"), 4);
    }

    @Override
    public void display() {
    }

    @Override
    public void add(Object item) {
    }

    @Override
    public void edit(Object item) {
    }

    @Override
    public List<Facility> getAll() {
        return new ArrayList<>(facilities.keySet());
    }

    @Override
    public Map<Facility, Integer> getAllWithUsage() {
        return facilities;
    }

    @Override
    public String generateCode(String type) {
        return switch (type) {
            case "Villa" -> String.format("SVVL-%04d", villaCount++);
            case "House" -> String.format("SVHO-%04d", houseCount++);
            case "Room"  -> String.format("SVRO-%04d", roomCount++);
            default -> "UNKNOWN";
        };
    }

    @Override
    public void increaseUsage(String serviceCode) {
        facilities.entrySet().stream()
                .filter(e -> e.getKey().getServiceCode().equals(serviceCode))
                .findFirst()
                .ifPresent(e -> e.setValue(e.getValue() + 1));
    }

    @Override
    public void displayMaintenance() {
    }
}