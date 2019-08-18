package work.chenbo.springcloud.order_server_api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * 订单实体
 * @className Order
 * @authtor ChenBo
 * @date 2019/8/12
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Order implements Serializable {
    /** 订单id */
    @NonNull
    private Integer id;
    /** 订单名称 */
    private String name;
    /** 订单流水号 */
    @NonNull
    private Long order_no;
    /** 商品价格 */
    private Integer price;
    /** 商品id */
    @NonNull
    private Integer produce_id;
    /** 商品名称 */
    private String produce_name;
    /** 用户id */
    @NonNull
    private Integer user_id;
    /** 用户名称 */
    private String user_name;
}
