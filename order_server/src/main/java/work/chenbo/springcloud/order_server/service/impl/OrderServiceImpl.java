package work.chenbo.springcloud.order_server.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import work.chenbo.springcloud.order_server.domain.Order;
import work.chenbo.springcloud.order_server.service.OrderService;

/**
 * @className OrderServiceImpl
 * @authtor ChenBo
 * @date 2019/8/12
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 商品下单
     * @param produce_id
     * @author: ChenBo
     * @date: 2019/8/14
     */
    @Override
    public Order order(Integer produce_id) {
        Order order = new Order(11, 11L, produce_id, 21);
        Object object = restTemplate.getForObject("http://produce-server/api/vi/produce/find?id="+produce_id, Object.class);
        log.info("object={}",object);
        return order;
    }
}
