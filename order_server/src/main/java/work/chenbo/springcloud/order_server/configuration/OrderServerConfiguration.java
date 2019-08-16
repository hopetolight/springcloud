package work.chenbo.springcloud.order_server.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @className OrderServerConfiguration
 * @authtor ChenBo
 * @date 2019/8/12
 */
@SpringBootConfiguration
public class OrderServerConfiguration {

    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/12
    */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
