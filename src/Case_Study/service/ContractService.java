package Case_Study.service;

import Case_Study.entity.Contract;
import Case_Study.repository.ContractRepository;

import java.util.Scanner;

public class ContractService implements IContractService {

    private static final ContractRepository contractRepo = new ContractRepository();
    private final Scanner scanner = new Scanner(System.in);


    @Override
    public void createContract(String bookingCode) {
        String contractNo = contractRepo.generateContractNumber();

        System.out.print("Nhập tiền đặt cọc (VND): ");
        double deposit = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập tổng tiền thanh toán (VND): ");
        double total = Double.parseDouble(scanner.nextLine());

        Contract contract = new Contract(contractNo, bookingCode, deposit, total);
        contractRepo.add(contract);

        System.out.println("→ HỢP ĐỒNG " + contractNo + " ĐÃ TẠO THÀNH CÔNG CHO BOOKING " + bookingCode + "!");
    }

    @Override
    public void displayContracts() {
        contractRepo.display();
    }

    @Override
    public void editContract() {
        if (contractRepo.getAll().isEmpty()) {
            System.out.println("Chưa có hợp đồng nào để sửa!");
            return;
        }

        contractRepo.display();

        System.out.print("Nhập số hợp đồng cần sửa (VD: HD-0001): ");
        String contractNo = scanner.nextLine().trim();

        Contract contract = contractRepo.findByNumber(contractNo);
        if (contract == null) {
            System.out.println("Không tìm thấy hợp đồng " + contractNo + "!");
            return;
        }

        System.out.println("Hợp đồng hiện tại:");
        System.out.println("→ Tiền cọc: " + String.format("%,.0f", contract.getDeposit()));
        System.out.println("→ Tổng tiền: " + String.format("%,.0f", contract.getTotalPayment()));

        System.out.print("Nhập tiền đặt cọc mới: ");
        double newDeposit = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập tổng tiền thanh toán mới: ");
        double newTotal = Double.parseDouble(scanner.nextLine());

        contract.setDeposit(newDeposit);
        contract.setTotalPayment(newTotal);

        System.out.println("→ ĐÃ CẬP NHẬT THÀNH CÔNG HỢP ĐỒNG " + contractNo + "!");
    }
}
