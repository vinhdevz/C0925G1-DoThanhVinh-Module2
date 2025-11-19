package Case_Study.repository;

import Case_Study.entity.Facility;
import java.util.Map;

public interface IFacilityRepository extends Repository<Facility> {
    Map<Facility, Integer> getAllWithUsage();
    void increaseUsage(String serviceCode);
}