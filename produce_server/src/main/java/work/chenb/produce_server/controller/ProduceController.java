package work.chenb.produce_server.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import work.chenbo.springcloud.produce_service_api.domain.Produce;
import work.chenb.produce_server.service.ProduceService;
import work.chenbo.springcloud.produce_service_api.controller.ProduceControllerApi;

import java.util.ArrayList;

/**
 * @className ProduceController
 * @authtor ChenBo
 * @date 2019/8/6
 */
@RestController
public class ProduceController implements ProduceControllerApi {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProduceService produceService;
    
    /**
     *
     * @author; ChenBo
     * @datetime: 2019/8/7
     */
    @Override
    @HystrixCommand(fallbackMethod = "queryListFallBack")
    public @ResponseBody Object queryList(){
        return  produceService.queryList();
    }
    private @ResponseBody Object queryListFallBack(){
        return new ArrayList<>();
    }

    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/7
    */
    @Override
    @HystrixCommand(fallbackMethod = "queryProduceFallBack")
    public @ResponseBody Produce queryProduce(@RequestParam("id") Integer id){
        Produce produce = produceService.queryProduceById(id);
        produce.setName(produce.getName()+" port form"+port);
        return produce;
    }
    private @ResponseBody Produce queryProduceFallBack(@RequestParam("id") Integer id){
        return new Produce();
    }
}
