package Case_Study.repository;

import Case_Study.service.IPromotionService;

import java.util.ArrayList;
import java.util.List;

public class PromotionRepository implements IPromotionService {
    private static List<Promotion> promotions = new ArrayList<>();

    @Override
    public void displayCustomersUseService() {

    }

    @Override
    public void displayCustomersGetVoucher() {

    }
}
