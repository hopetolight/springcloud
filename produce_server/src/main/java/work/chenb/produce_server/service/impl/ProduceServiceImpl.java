package work.chenb.produce_server.service.impl;

import org.springframework.stereotype.Service;
import work.chenbo.springcloud.produce_service_api.domain.Produce;
import work.chenb.produce_server.service.ProduceService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className ProduceServiceImpl
 * @authtor ChenBo
 * @date 2019/8/6
 */
@Service
public class ProduceServiceImpl implements ProduceService {

    private static final Map<Integer,Produce> PRODUCE_DAO = new HashMap(){{
        put(1,new Produce(1,"手机",5000,100));
        put(2,new Produce(2,"电脑",10000,100));
        put(3,new Produce(3,"平板",8000,100));
        put(4,new Produce(4,"游戏机",3000,100));
        put(5,new Produce(5,"虚拟现实",50000,100));
    }};

    /**
     * 查询全部
     *
     * @author; ChenBo
     * @datetime: 2019/8/6
     */
    @Override
    public List<Produce> queryList() {
        return new ArrayList<>(PRODUCE_DAO.values());
    }

    /**
     * 根据id查询详情
     *
     * @param id
     * @author; ChenBo
     * @datetime: 2019/8/6
     */
    @Override
    public Produce queryProduceById(Integer id) {
        return PRODUCE_DAO.get(id);
    }
}
