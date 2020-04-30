package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PluralsightEurekaTollrateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightEurekaTollrateServiceApplication.class, args);
	}
}
