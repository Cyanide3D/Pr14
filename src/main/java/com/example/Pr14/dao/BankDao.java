package com.example.Pr14.dao;

import com.example.Pr14.models.Bank;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankDao {

    private List<Bank> banks = new ArrayList<>();

    public void save(Bank bank) {
        banks.add(bank);
    }

    public void delete(String name) {
        banks.removeIf(bank -> bank.getName().equalsIgnoreCase(name));
    }

    public List<Bank> getAllBanks() {
        return banks;
    }

}
