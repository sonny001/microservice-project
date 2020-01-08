package com.rest.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionStatus;

/**
 * @program microservice-project
 * @description: 1
 * @author: sonny
 * @create: 2020/01/08 12:41
 */
@Component(value = "transactionDemo")
public class MyPlatformTransactionManager implements PlatformTransactionManager {
    @Override
    public TransactionStatus getTransaction(TransactionDefinition transactionDefinition) throws TransactionException {
        return new DefaultTransactionStatus(null, true, true, transactionDefinition.isReadOnly(), true, null);
    }

    @Override
    public void commit(TransactionStatus transactionStatus) throws TransactionException {
        System.out.println("commit()");
    }

    @Override
    public void rollback(TransactionStatus transactionStatus) throws TransactionException {
        System.out.println("commit()");
    }
}
