package cn.t00strive.toomall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ToomallGatewayApplication {
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ToomallGatewayApplication.class, args);
	}

}
