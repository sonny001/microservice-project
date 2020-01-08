package spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

/**
 * @program microservice-project
 * @description: ApplicationEventMulticasterDemo
 * @author: sonny
 * @create: 2019/12/28 18:23
 */
public class ApplicationEventMulticasterDemo {

    public static void main(String[] args) {
        ApplicationEventMulticaster applicationEventMulticaster = new SimpleApplicationEventMulticaster();
        applicationEventMulticaster.addApplicationListener(event->{
            System.err.println("event:{}"+event);
            System.err.println("event:{}"+PayloadApplicationEvent.class.cast(event).getPayload());
        });
        applicationEventMulticaster.multicastEvent(new PayloadApplicationEvent<Object>("1","a"));
        applicationEventMulticaster.multicastEvent(new PayloadApplicationEvent<Object>("2","b"));
    }
}
