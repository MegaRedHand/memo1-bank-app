package com.aninfo.service;

import com.aninfo.model.Transaction;
import com.aninfo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;


    public Collection<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> findById(Long id) {
        return transactionRepository.findById(id);
    }

    public Collection<Transaction> getAccountTransactions(Long cbu) {
        return transactionRepository.findTransactionsByAccountCbu(cbu);
    }

    public void deleteById(Long id) {
        transactionRepository.deleteById(id);
    }

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
