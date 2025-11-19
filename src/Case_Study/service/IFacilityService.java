package Case_Study.service;

import Case_Study.entity.Facility;

import java.util.Map;

public interface IFacilityService extends Service{
    Map<Facility, Integer> getAllWithUsage();
    String generateCode(String type);
    void increaseUsage(String serviceCode);
    void displayMaintenance();
}
