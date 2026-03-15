package com.luiz.financial_system.service;

import com.luiz.financial_system.entity.Transaction;
import com.luiz.financial_system.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction create(Transaction transaction) {
        return repository.save(transaction);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Transaction getById(Long id) {
        return repository.findById(id).orElse(null);
    }

}
