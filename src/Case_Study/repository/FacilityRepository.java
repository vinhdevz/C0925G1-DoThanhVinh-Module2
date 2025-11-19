package Case_Study.repository;

import Case_Study.entity.Facility;
import Case_Study.entity.House;
import Case_Study.entity.Room;
import Case_Study.entity.Villa;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {

    private static final Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        facilityMap.put(new Villa("SVVL-0001", "Villa Beach", 300, 5_000_000, 10, "Day", "VIP", 50, 3), 0);
        facilityMap.put(new Villa("SVVL-0002", "Villa Mountain", 250, 4_000_000, 8, "Day", "Luxury", 40, 2), 3);
        facilityMap.put(new House("SVHO-0001", "House Garden", 150, 2_000_000, 6, "Day", "Standard", 2), 6);
        facilityMap.put(new Room("SVRO-0001", "Room Sea View", 40, 800_000, 2, "Day", "Breakfast"), 4);
    }

    @Override
    public List<Facility> getAll() {
        return facilityMap.keySet().stream().toList();
    }

    @Override
    public void display() {
        System.out.println("\n--- Facility List ---");
        facilityMap.forEach((f, count) -> System.out.println(f + " | Used: " + count + " times"));
        System.out.println("---------------------\n");
    }

    @Override
    public void add(Facility facility) {
//        if (facilityMap.containsKey()) {
//            throw new IllegalArgumentException("Service code already exists!");
//        }
//        facilityMap.put(facility, 0);
    }

    @Override
    public void edit(Facility facility) {
    }

    @Override
    public Map<Facility, Integer> getAllWithUsage() {
        return new LinkedHashMap<>(facilityMap);
    }

    @Override
    public void increaseUsage(String serviceCode) {
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getKey().getServiceCode().equals(serviceCode)) {
                entry.setValue(entry.getValue() + 1);
                return;
            }
        }
    }
}