package work.chenbo.springcloud.order_server.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import work.chenbo.springcloud.order_server.domain.Order;
import work.chenbo.springcloud.order_server.service.OrderService;

import java.util.Map;

/**
 * @className OrderServiceImpl
 * @authtor ChenBo
 * @date 2019/8/12
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 商品下单
     * @param produce_id
     * @author: ChenBo
     * @date: 2019/8/14
     */
    @Override
    public Order order(Integer produce_id) {

        ServiceInstance serviceInstance = loadBalancerClient.choose("produce-server");

        String url = String.format("http:%s:%s/api/vi/produce/find?id=" + produce_id, serviceInstance.getHost(), serviceInstance.getPort());

        Order order = new Order(11, 11L, produce_id, 21);
        Map<String,Object> produceMap = new RestTemplate().getForObject(url, Map.class);
        log.info("object={}",produceMap);
        order.setName(produceMap.get("name")+"_order");
        order.setPrice(Integer.valueOf(produceMap.get("price").toString()));
        order.setProduce_name(produceMap.get("name").toString());
        return order;
    }
}
