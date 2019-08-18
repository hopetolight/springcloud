package work.chenbo.springcloud.order_server.service;

import work.chenbo.springcloud.order_server_api.domain.Order;

/**
 * @interfaceName OrderService
 * @authtor ChenBo
 * @date 2019/8/12
 */
public interface OrderService {

    /**
     * 商品下单
     * @author: ChenBo
     * @date: 2019/8/14
     */
    Order order(Integer produce_id);
}
