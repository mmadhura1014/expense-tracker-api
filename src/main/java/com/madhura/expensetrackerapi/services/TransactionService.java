package com.madhura.expensetrackerapi.services;

import com.madhura.expensetrackerapi.domain.Transaction;
import com.madhura.expensetrackerapi.exceptions.EtBadRequestException;

import java.util.List;

public interface TransactionService {

    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtBadRequestException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Integer transactionDate) throws EtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtBadRequestException;


}
