package spring;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @program microservice-project
 * @description: 监听事件
 * @author: sonny
 * @create: 2019/09/02 20:31
 */
public class SpringEventListenerDemo {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();

//        context.addApplicationListener(new CloseEvent());
//        context.addApplicationListener(new RefreEvent());

        context.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.err.println("event:{}"+event);
            }
        });

        context.refresh();

        context.publishEvent("Hellow");
        context.publishEvent(new MyEvent("123"));

        context.close();

    }

    public static class CloseEvent implements ApplicationListener<ContextClosedEvent> {

        @Override
        public void onApplicationEvent(ContextClosedEvent event) {
            System.err.println("closeEvent:"+event);
        }
    }

    public static class RefreEvent implements ApplicationListener<ContextRefreshedEvent> {

        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {
            System.err.println("refreEvent:"+event);
        }
    }

    public static class MyEvent extends ApplicationEvent{

        public MyEvent(Object source) {
            super(source);
            System.err.println("MyEvent");
        }
    }

}
