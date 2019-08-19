package work.chenbo.springcloud.order_server.feginClient;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import work.chenbo.springcloud.produce_service_api.controller.ProduceControllerApi;
import work.chenbo.springcloud.produce_service_api.domain.Produce;

/**
 * @interfaceName ProducerServiceClient
 * @authtor ChenBo
 * @date 2019/8/18
 */
@FeignClient(name = "produce-server",fallbackFactory = ProducerServiceClient.ProducerServiceFallBack.class)
public interface ProducerServiceClient extends ProduceControllerApi {
    @Component
    class ProducerServiceFallBack implements FallbackFactory<ProducerServiceClient> {

        @Override
        public ProducerServiceClient create(Throwable cause) {
            return new ProducerServiceClient() {
                private final Logger log = LoggerFactory.getLogger(ProducerServiceClient.class);

                @Override
                public Object queryList() {
                    log.info("商品服务请求错误,该服务断路返回fallback");
                    return null;
                }

                @Override
                public Produce queryProduce(Integer id) {
                    log.info("商品服务请求错误,该服务断路返回fallback");
                    return null;
                }
            };
        }
    }
}
