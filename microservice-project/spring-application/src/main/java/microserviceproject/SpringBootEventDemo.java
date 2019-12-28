package microserviceproject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @program microservice-project
 * @description: Springboot监听
 * @author: sonny
 * @create: 2019/09/02 21:00
 */
@EnableAutoConfiguration
public class SpringBootEventDemo {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootEventDemo.class)
        .listeners(applicationEvent -> {
            System.out.println("监听事件："+applicationEvent.getClass().getSimpleName());
        })
        .run(args);
    }
}
