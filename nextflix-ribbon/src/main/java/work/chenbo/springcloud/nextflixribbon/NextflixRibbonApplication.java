package work.chenbo.springcloud.nextflixribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NextflixRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(NextflixRibbonApplication.class, args);
    }

}
