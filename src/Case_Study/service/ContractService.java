package Case_Study.service;

import java.util.ArrayList;

public class ContractService implements IContractService{
    private static List<Contract> contracts = new ArrayList<>();

    @Override
    public List<Contract> getAll() {
        return contracts;
    }

    @Override
    public void add(Contract contract) {
        contracts.add(contract);
    }
}
