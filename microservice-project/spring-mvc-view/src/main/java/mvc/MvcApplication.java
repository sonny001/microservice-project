package mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MicroserviceProjectApplication.class, args);
		//启动随机端口的服务 实现方式一
//		new SpringApplicationBuilder(MicroserviceProjectApplication.class).properties("server.port=0").run(args);
		//启动随机端口的服务 实现方式二
		SpringApplication springApplication=new SpringApplication(MvcApplication.class);
		springApplication.run(args);
	}

}
