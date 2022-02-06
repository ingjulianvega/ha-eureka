package ingjulianvega.ximic.haeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaEurekaApplication.class, args);
	}

}
