package com.aninfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long accountCbu;

    private Double amount;

    private TransactionType type;

    public Transaction() {}

    public Transaction(Long accountCbu, Double amount, TransactionType type) {
        this.accountCbu = accountCbu;
        this.amount = amount;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getAccountCbu() {
        return accountCbu;
    }

    public void setAccountCbu(Long accountCbu) {
        this.accountCbu = accountCbu;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}
