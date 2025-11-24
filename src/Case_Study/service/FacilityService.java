package Case_Study.service;

import Case_Study.entity.Facility;
import Case_Study.repository.FacilityRepository;
import Case_Study.repository.IFacilityRepository;

public class FacilityService implements IFacilityService {

    private final IFacilityRepository repo = FacilityRepository.getInstance();

    @Override
    public void displayListFacility() {
        repo.displayListFacility();
    }

    @Override
    public void displayMaintenance() {
        repo.displayMaintenance();
    }

    @Override
    public void addNewFacility(Facility f) {
        repo.add(f);
    }

    @Override
    public void display() {
    }

    @Override
    public void add(Object item) {

    }

    @Override
    public void edit(String id) {
    }

    @Override
    public java.util.List<Facility> getAll() {
        return repo.getAll();
    }
}