package Case_Study.controller;

import Case_Study.entity.Facility;
import Case_Study.service.IFacilityService;
import Case_Study.view.FacilityView;

public class FacilityController {

    private final IFacilityService service;
    private final FacilityView view = new FacilityView();

    public FacilityController(IFacilityService service) {
        this.service = service;
    }

    public void menuFacility() {
        while (true) {
            int choice = view.showMenu();
            switch (choice) {
                case 1 -> view.displayList(service.getAllWithUsage());
                case 2 -> addNewFacility();
                case 3 -> view.displayMaintenance(service.getAllWithUsage());
                case 4 -> {
                    System.out.println("Returning to main menu...\n");
                    return;
                }
                default -> view.showError("Choose 1-4 only!");
            }
        }
    }

    private void addNewFacility() {
        while (true) {
            int typeChoice = view.showAddMenu();
            if (typeChoice == 4) return;

            String type = switch (typeChoice) {
                case 1 -> "Villa";
                case 2 -> "House";
                case 3 -> "Room";
                default -> null;
            };
            if (type == null) {
                view.showError("Choose 1-3!");
                continue;
            }

            String code = service.generateCode(type);
            Facility f = view.createFacility(code, type);

            service.add(f);
            view.showSuccess("Successfully added " + type + ": " + f.getServiceName());
        }
    }
}