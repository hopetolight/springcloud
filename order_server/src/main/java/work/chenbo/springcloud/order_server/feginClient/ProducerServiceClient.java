package work.chenbo.springcloud.order_server.feginClient;

import org.springframework.cloud.openfeign.FeignClient;
import work.chenbo.springcloud.produce_service_api.controller.ProduceControllerApi;

/**
 * @interfaceName ProducerServiceClient
 * @authtor ChenBo
 * @date 2019/8/18
 */
@FeignClient(name = "produce-server")
public interface ProducerServiceClient extends ProduceControllerApi {
}
