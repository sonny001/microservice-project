package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program microservice-project
 * @description: spring注解
 * @author: sonny
 * @create: 2019/08/30 20:26
 */
@Configuration
public class SpringAnnotationDemo {

    public static void main(String[] args) {

        //xml配置文件驱动
        //        ClassPathXmlApplicationContext
        //Annotation 驱动 注解驱动
        // 都是找Bean的定义 @Bean @Configuration
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        //注册一个Configuration Class=SpringAnnotationDemo
        context.register(SpringAnnotationDemo.class);
        //上下文启动
        context.refresh();
        System.out.println(context.getBean(SpringAnnotationDemo.class));
    }
}
