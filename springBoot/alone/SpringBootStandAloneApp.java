package alone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
 
 
@EnableAutoConfiguration
@ComponentScan("springBoot.alone")
//OR JUST USE @SpringBootApplication(scanBasePackages={"com.websystique.springboot"})//
//same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringBootStandAloneApp {

	public static void main(String[] args) {
		 SpringApplication.run(SpringBootStandAloneApp.class, args);

	}

}
