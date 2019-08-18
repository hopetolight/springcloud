package work.chenbo.springcloud.produce_service_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import work.chenbo.springcloud.produce_service_api.domain.Produce;

/**
 * @className ProduceControllerApi
 * @authtor ChenBo
 * @date 2019/8/18
 */
@RequestMapping("/api/vi/produce")
public interface ProduceControllerApi {


    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/18
    */
    @RequestMapping("list")
    @ResponseBody
    Object queryList();


    /**
    *
    * @author; ChenBo
    * @datetime: 2019/8/18
    */
    @RequestMapping("find")
    @ResponseBody
    Produce queryProduce(@RequestParam("id") Integer id);

}
