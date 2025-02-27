package rbenitez.service.gateway_banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayBankingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayBankingApplication.class, args);
    }

}
