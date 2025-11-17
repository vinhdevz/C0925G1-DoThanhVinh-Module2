package Case_Study.service;

import Case_Study.entity.Facility;

import java.util.Map;

public interface IFacilityService {
    void display();
    void add(Facility facility);
    void displayMaintenance();
    Map<Facility, Integer> getFacilityMap();
}
