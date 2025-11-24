package Case_Study.repository;

import Case_Study.entity.Facility;

public interface IFacilityRepository extends Repository<Facility> {
    void displayMaintenance();

    void displayListFacility();

}