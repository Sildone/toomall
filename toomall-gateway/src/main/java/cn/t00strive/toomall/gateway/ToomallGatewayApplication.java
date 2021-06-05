package cn.t00strive.toomall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ToomallGatewayApplication
 *
 * @author Sildone
 * @date 2021/06/05 23:08
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ToomallGatewayApplication {
    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ToomallGatewayApplication.class, args);
    }

}
