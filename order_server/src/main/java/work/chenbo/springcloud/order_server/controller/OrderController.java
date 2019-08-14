package work.chenbo.springcloud.order_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import work.chenbo.springcloud.order_server.domain.Order;
import work.chenbo.springcloud.order_server.service.OrderService;

/**
 * @className OrderController
 * @authtor ChenBo
 * @date 2019/8/12
 */
@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("/purchasing")
    public @ResponseBody Object order(@RequestParam("id") Integer id){
        return orderService.order(id);
    }
}
