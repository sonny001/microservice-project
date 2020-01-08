package com.rest.service;

import com.rest.annotation.TransactionalService;

/**
 * @program microservice-project
 * @description: 注解测试demo
 * @author: sonny
 * @create: 2020/01/08 11:52
 */

@TransactionalService(value="transactionDemo123456",getTxName = "transactionDemo")
public class TransactionDemo {

    public void echo(String msg) {
        System.out.println(msg);
    }

}
