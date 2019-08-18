package work.chenbo.springcloud.order_server_api.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @interfaceName OrderServiceApi
 * @authtor ChenBo
 * @date 2019/8/18
 */
@RequestMapping("/api/v1/order")
public interface OrderServiceApi {

    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/18
    */
    @RequestMapping("purchasing")
    @ResponseBody
    Object order(@RequestParam("id") Integer id);
}
