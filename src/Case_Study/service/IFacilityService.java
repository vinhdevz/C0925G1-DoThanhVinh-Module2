package Case_Study.service;

import Case_Study.entity.Facility;

public interface IFacilityService extends Service {
    void displayMaintenance();
    void displayListFacility();
    void addNewFacility(Facility facility);
}
