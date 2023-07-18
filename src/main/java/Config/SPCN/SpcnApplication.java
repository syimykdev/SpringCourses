package Config.SPCN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(GreetingProperties.class)
@SpringBootApplication
public class SpcnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpcnApplication.class, args);
	}

}
