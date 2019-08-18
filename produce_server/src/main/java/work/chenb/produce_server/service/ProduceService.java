package work.chenb.produce_server.service;

import work.chenbo.springcloud.produce_service_api.domain.Produce;

import java.util.List;

/**
 * @interfaceName ProduceService
 * @authtor ChenBo
 * @date 2019/8/6
 */
public interface ProduceService {
    /**
    * 查询全部
    * @author; ChenBo
    * @datetime: 2019/8/6
    */
    List<Produce> queryList();

    /**
    * 根据id查询详情
    * @author; ChenBo
    * @datetime: 2019/8/6
    */
    Produce queryProduceById(Integer id);
}
