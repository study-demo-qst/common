package com.example.common.repository;

import com.example.common.model.CreditCardDetails;
import com.example.common.model.TransactionLog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionLogRepository extends JpaRepository<TransactionLog, Long> {
    TransactionLog findByTransactionId(String transactionId);

    List<TransactionLog> findByCardDetails(CreditCardDetails cardDetails);
}
