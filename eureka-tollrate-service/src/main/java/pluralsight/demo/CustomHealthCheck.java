package pluralsight.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator{

	private int error = 0;
	
	@Override
	public Health health() {
		
		if(error>4 && error<8)
		{
			error++;
			System.out.println("Service is not healthy");
			return Health.down().withDetail("message", "Service is down, Error code: "+error).build();
		}
		error++;
		System.out.println("Service is healthy");
		return Health.up().build();
	}

}
