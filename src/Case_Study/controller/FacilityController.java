package Case_Study.controller;

import Case_Study.entity.Facility;
import Case_Study.service.FacilityService;
import Case_Study.service.IFacilityService;
import Case_Study.view.FacilityView;

public class FacilityController {

    private final IFacilityService service = new FacilityService();

    public void runFac() {
        while (true) {
            FacilityView.displayMenuFacility();
            String choice = new java.util.Scanner(System.in).nextLine().trim();

            switch (choice) {
                case "1" -> service.displayListFacility();
                case "2" -> addNewFacility();
                case "3" -> service.displayMaintenance();
                case "4" -> {
                    System.out.println("Quay lại menu chính...\n");
                    return;
                }
                default -> System.out.println("Chỉ chọn 1-4 thôi!");
            }
        }
    }

    private void addNewFacility() {
        System.out.println("\n1. Villa\n2. House\n3. Room");
        System.out.print("Chọn loại: ");
        String ch = new java.util.Scanner(System.in).nextLine();

        Facility f = switch (ch) {
            case "1" -> FacilityView.inputVilla();
            case "2" -> FacilityView.inputHouse();
            case "3" -> FacilityView.inputRoom();
            default -> {
                System.out.println("Không hợp lệ!");
                yield null;
            }
        };

        if (f != null) {
            service.addNewFacility(f);
            System.out.println("ĐÃ THÊM THÀNH CÔNG VÀ LƯU VÀO HỆ THỐNG!");
        }
    }
}