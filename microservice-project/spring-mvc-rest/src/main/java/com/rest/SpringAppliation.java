package com.rest;

import com.rest.service.TransactionDemo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.DefaultTransactionStatus;

import javax.swing.*;

/**
 * @program microservice-project
 * @description: 测试注解
 * @author: sonny
 * @create: 2020/01/08 11:53
 */
@ComponentScan(basePackages = "com.rest.service")
@EnableTransactionManagement
public class SpringAppliation {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringAppliation.class);

        context.refresh();
        context.getBeansOfType(TransactionDemo.class).forEach((beanName, bean) -> {
            System.out.println(beanName);
            System.out.println(bean);
            bean.echo("hello world");
        });
        context.close();
    }
}
