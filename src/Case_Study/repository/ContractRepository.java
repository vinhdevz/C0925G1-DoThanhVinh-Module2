package Case_Study.repository;

import Case_Study.entity.Contract;

import java.util.ArrayList;
import java.util.List;

public class ContractRepository {
    private static final List<Contract> contracts = new ArrayList<>();
    private static int counter = 1;

    public void add(Contract c) {
        contracts.add(c);
    }

    public List<Contract> getAll() {
        return new ArrayList<>(contracts);
    }

    public Contract findByNumber(String contractNo) {
        for (Contract c : contracts) {
            if (c.getContractNumber().equals(contractNo)) {
                return c;
            }
        }
        return null;
    }

    public void display() {
        if (contracts.isEmpty()) {
            System.out.println("\nChưa có hợp đồng nào!\n");
            return;
        }

        System.out.println("\n=== DANH SÁCH HỢP ĐỒNG ===");
        System.out.println("STT | Số HĐ | Booking | Tiền cọc | Tổng tiền");
        for (int i = 0; i < contracts.size(); i++) {
            Contract c = contracts.get(i);
            System.out.println((i + 1) + " | " +
                    c.getContractNumber() + " | " +
                    c.getBookingCode() + "  | " +
                    String.format("%,.0f", c.getDeposit()) + " | " +
                    String.format("%,.0f", c.getTotalPayment()) + " VND");
        }
    }

    public String generateContractNumber() {
        return String.format("HD-%04d", counter++);
    }
}