package Case_Study.repository;

import Case_Study.entity.*;
import Case_Study.util.ReadAndWriteFile;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {

    private static final Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static final FacilityRepository instance = new FacilityRepository();

    private static final String FILE_PATH = "src/Case_Study/data/facility.csv";


    public static FacilityRepository getInstance() {
        return instance;
    }

    private int villaCount = 1, houseCount = 1, roomCount = 1;

    public FacilityRepository() {
        loadFromFile();
        if (facilityMap.isEmpty()) {
            initSampleData();
            saveToFile();
        }
        updateCounters();
    }

    private void initSampleData() {
        facilityMap.put(new Villa("SVVL-0001", "Villa Royal", 400, 15000000, 12, "Day", "VIP", 80, 3), 3);
        facilityMap.put(new Villa("SVVL-0002", "Villa Beach", 300, 12000000, 10, "Day", "Luxury", 60, 2), 0);
        facilityMap.put(new House("SVHO-0001", "House Garden", 200, 8000000, 8, "Day", "Standard", 2), 6);
        facilityMap.put(new Room("SVRO-0001", "Room Ocean View", 50, 2500000, 4, "Day", "Breakfast + Massage"), 10);
    }

    private void updateCounters() {
        for (Facility f : facilityMap.keySet()) {
            String code = f.getServiceCode();
            if (code.startsWith("SVVL")) villaCount = Math.max(villaCount, Integer.parseInt(code.substring(6)) + 1);
            if (code.startsWith("SVHO")) houseCount = Math.max(houseCount, Integer.parseInt(code.substring(6)) + 1);
            if (code.startsWith("SVRO")) roomCount = Math.max(roomCount, Integer.parseInt(code.substring(6)) + 1);
        }
    }

    @Override
    public void displayListFacility() {
        System.out.println("\n=== DANH SÁCH DỊCH VỤ ===");
        if (facilityMap.isEmpty()) {
            System.out.println("→ Danh sách trống!");
        } else {
            facilityMap.forEach((f, count) -> System.out.println(f + " → Đã dùng: " + count + " lần"));
        }
        System.out.println();
    }

    @Override
    public void add(Facility item) {
        facilityMap.put(item, 0);
        saveToFile();
        System.out.println("THÊM THÀNH CÔNG: " + item.getServiceCode());
    }

    @Override
    public void displayMaintenance() {
        System.out.println("\n=== DỊCH VỤ CẦN BẢO TRÌ (>5 lần) ===");
        boolean co = false;
        for (Map.Entry<Facility, Integer> e : facilityMap.entrySet()) {
            if (e.getValue() > 5) {
                co = true;
                System.out.println("CẦN BẢO TRÌ: " + e.getKey() + " (dùng " + e.getValue() + " lần)");
            }
        }
        if (!co) System.out.println("→ Không có dịch vụ nào cần bảo trì.");
        System.out.println();
    }

    private void saveToFile() {
        List<String> lines = new ArrayList<>();
        for (Map.Entry<Facility, Integer> e : facilityMap.entrySet()) {
            lines.add(e.getKey().getClass().getSimpleName() + "," + e.getKey().toCSV() + "," + e.getValue());
        }
        ReadAndWriteFile.write(FILE_PATH, lines);
    }

    private void loadFromFile() {
        List<String> lines = ReadAndWriteFile.readFile(FILE_PATH);
        facilityMap.clear();
        for (String line : lines) {
            if (line.isBlank()) continue;
            String[] p = line.split(",", -1);
            if (p.length < 2) continue;
            String type = p[0];
            int usage = Integer.parseInt(p[p.length - 1]);
            String data = String.join(",", Arrays.copyOfRange(p, 1, p.length - 1));

            Facility f = switch (type) {
                case "Villa" -> Villa.fromCSV(data);
                case "House" -> House.fromCSV(data);
                case "Room" -> Room.fromCSV(data);
                default -> null;
            };
            if (f != null) facilityMap.put(f, usage);
        }
    }

    @Override
    public void display() {
    }

    @Override
    public void edit(String id) {
    }

    public Facility findByCode(String code) {
        for (Facility f : facilityMap.keySet()) {
            if (f.getServiceCode().equals(code)) {
                return f;
            }
        }
        return null;
    }

    @Override
    public List<Facility> getAll() {
        return new ArrayList<>(facilityMap.keySet());
    }
}