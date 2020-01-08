package com.rest.annotation;


import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Service
@Transactional
public @interface TransactionalService {


    //Service 派生Component ，Component只能识别value，因此此处使用其他别名将不能用。
    @AliasFor(annotation = Service.class)
    String value();

    @AliasFor(annotation = Transactional.class,value = "value")
    String getTxName();
}
