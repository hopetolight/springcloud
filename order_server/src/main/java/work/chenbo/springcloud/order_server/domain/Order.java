package work.chenbo.springcloud.order_server.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @className Order
 * @authtor ChenBo
 * @date 2019/8/12
 */
@Data
@NoArgsConstructor
public class Order implements Serializable {
    private Integer id;
    private String name;
    private Long order_no;
    private Integer price;
    private Integer user_id;
    private String user_name;
}
