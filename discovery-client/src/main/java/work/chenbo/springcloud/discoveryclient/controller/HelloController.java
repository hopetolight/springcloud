package work.chenbo.springcloud.discoveryclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className HelloController
 * @authtor ChenBo
 * @date 2019/7/11
 */
@RestController
@Slf4j
public class HelloController {




    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello")
    public String index(){
        List<ServiceInstance> eureka = discoveryClient.getInstances("discovery-client");
        eureka.forEach(serviceInstance -> log.info("url{}",serviceInstance.getUri()));
        return "Hello word";
    }
}
