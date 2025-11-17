package Case_Study.service;

public class PromotionService implements IPromotionService{
    @Override
    public void displayCustomersUseService() {
        System.out.println("Display customers who used service");
    }

    @Override
    public void displayCustomersGetVoucher() {
        System.out.println("Display customers get voucher");
    }
}
