package com.example.Pr14.controllers;

import com.example.Pr14.dao.BankDao;
import com.example.Pr14.models.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankDao bankDao;

    @GetMapping
    public List<Bank> getAll() {
        return bankDao.getAllBanks();
    }

    @PostMapping
    public void save(@RequestBody Bank bank) {
        bankDao.save(bank);
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable("name") String name) {
        bankDao.delete(name);
    }

}
