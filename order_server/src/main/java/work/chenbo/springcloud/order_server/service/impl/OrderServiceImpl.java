package work.chenbo.springcloud.order_server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import work.chenbo.springcloud.order_server.service.OrderService;

/**
 * @className OrderServiceImpl
 * @authtor ChenBo
 * @date 2019/8/12
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

}
