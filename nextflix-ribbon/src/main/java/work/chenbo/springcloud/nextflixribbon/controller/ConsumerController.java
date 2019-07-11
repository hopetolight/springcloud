package work.chenbo.springcloud.nextflixribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @className ConsumerController
 * @authtor ChenBo
 * @date 2019/7/11
 */
@RestController
@RequestMapping(value = "ribbon")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/hello")
    public String index(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://DISCOVERY-CLIENT/hello", String.class);
        String body = forEntity.getBody();
        return body;
    }
}
