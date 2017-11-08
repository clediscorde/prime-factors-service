package ca.caledi.primefactorsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PrimeFactorsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrimeFactorsServiceApplication.class, args);
    }
}
