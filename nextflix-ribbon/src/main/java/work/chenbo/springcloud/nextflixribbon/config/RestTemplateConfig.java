package work.chenbo.springcloud.nextflixribbon.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @className RestTemplateConfig
 * @authtor ChenBo
 * @date 2019/7/11
 */
@SpringBootConfiguration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
