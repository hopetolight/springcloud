package work.chenbo.springcloud.order_server.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import work.chenbo.springcloud.order_server.feginClient.ProducerServiceClient;
import work.chenbo.springcloud.order_server.service.OrderService;
import work.chenbo.springcloud.order_server_api.domain.Order;
import work.chenbo.springcloud.produce_service_api.domain.Produce;

/**
 * @className OrderServiceImpl
 * @authtor ChenBo
 * @date 2019/8/12
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Autowired
    private ProducerServiceClient producerServiceClient;


    /**
     * 商品下单
     * @param produce_id
     * @author: ChenBo
     * @date: 2019/8/14
     */
    @Override
    public Order order(Integer produce_id) {
        Produce produce = producerServiceClient.queryProduce(produce_id);
        Order order = new Order(11, 11L, produce_id, 21);
        log.info("produce={}",produce);
        order.setName(produce.getName());
        order.setPrice(produce.getPrice());
        order.setProduce_name(produce.getName());
        return order;
    }
}
