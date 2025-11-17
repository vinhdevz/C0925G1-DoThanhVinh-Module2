package Case_Study.service;

import Case_Study.entity.Facility;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService{
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        // có thể thêm facility mẫu
    }

    @Override
    public void display() {
        facilityMap.forEach((k,v) -> System.out.println(k + " | used: " + v));
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    @Override
    public void displayMaintenance() {
        facilityMap.forEach((k,v) -> {
            if(v >= 5) System.out.println(k + " | used: " + v);
        });
    }

    @Override
    public Map<Facility, Integer> getFacilityMap() {
        return facilityMap;
    }
}
