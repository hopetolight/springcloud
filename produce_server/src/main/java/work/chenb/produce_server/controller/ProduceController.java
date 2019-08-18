package work.chenb.produce_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import work.chenbo.springcloud.produce_service_api.domain.Produce;
import work.chenb.produce_server.service.ProduceService;
import work.chenbo.springcloud.produce_service_api.controller.ProduceControllerApi;

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
    public @ResponseBody Object queryList(){
        return  produceService.queryList();
    }

    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/7
    */
    @Override
    public @ResponseBody Produce queryProduce(@RequestParam("id") Integer id){
        Produce produce = produceService.queryProduceById(id);
        produce.setName(produce.getName()+" port form"+port);
        return produce;
    }
}
