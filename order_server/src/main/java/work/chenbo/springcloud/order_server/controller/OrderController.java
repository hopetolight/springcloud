package work.chenbo.springcloud.order_server.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import work.chenbo.springcloud.order_server.service.OrderService;
import work.chenbo.springcloud.order_server_api.core.OrderServiceApi;
import work.chenbo.springcloud.order_server_api.domain.Order;

/**
 * @className OrderController
 * @authtor ChenBo
 * @date 2019/8/12
 */
@RestController
@Slf4j
public class OrderController implements OrderServiceApi {

    @Autowired
    private OrderService orderService;

    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/18
    */
    @Override
    @HystrixCommand(fallbackMethod = "orderFallBack")
    public @ResponseBody Object order(@RequestParam("id") Integer id){
        return orderService.order(id);
    }
    private @ResponseBody Object orderFallBack(@RequestParam("id") Integer id){
        log.info("接口访问错误返回降级数据");
        return new Order();
    }
}
