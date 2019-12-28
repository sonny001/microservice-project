package microserviceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
public class MicroserviceProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MicroserviceProjectApplication.class, args);
		//启动随机端口的服务
//		new SpringApplicationBuilder(MicroserviceProjectApplication.class).properties("server.port=0").run(args);
		SpringApplication springApplication=new SpringApplication(MicroserviceProjectApplication.class);
		Map<String,Object> properties=new LinkedHashMap<>();
		properties.put("server.port",0);
		springApplication.setDefaultProperties(properties);

		//设置为非web应用
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context=springApplication.run(args);
		System.out.println(context.getBean(MicroserviceProjectApplication.class));
		System.out.println(context.getClass().getName());

	}

}
