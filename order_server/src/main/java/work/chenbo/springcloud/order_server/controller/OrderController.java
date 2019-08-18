package work.chenbo.springcloud.order_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import work.chenbo.springcloud.order_server.service.OrderService;
import work.chenbo.springcloud.order_server_api.core.OrderServiceApi;

/**
 * @className OrderController
 * @authtor ChenBo
 * @date 2019/8/12
 */
@RestController
public class OrderController implements OrderServiceApi {

    @Autowired
    private OrderService orderService;

    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/18
    */
    @Override
    public @ResponseBody Object order(@RequestParam("id") Integer id){
        return orderService.order(id);
    }
}
