package work.chenb.produce_server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className Produce
 * @authtor ChenBo
 * @date 2019/8/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produce {
    private Integer id;
    private String name;
    private Integer price;
    private Integer stock;
}
