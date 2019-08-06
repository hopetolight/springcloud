package work.chenb.produce_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import work.chenb.produce_server.domain.Produce;
import work.chenb.produce_server.service.ProduceService;

/**
 * @className ProduceController
 * @authtor ChenBo
 * @date 2019/8/6
 */
@RestController
@RequestMapping("api/vi/produce")
public class ProduceController {

    @Autowired
    private ProduceService produceService;
    
    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/7
    */
    @RequestMapping("list")
    public @ResponseBody Object queryList(){
        return  produceService.queryList();
    }

    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/7
    */
    @RequestMapping("find")
    public @ResponseBody Produce queryProduce(@RequestParam("id") Integer id){
        return produceService.queryProduceById(id);
    }
}
