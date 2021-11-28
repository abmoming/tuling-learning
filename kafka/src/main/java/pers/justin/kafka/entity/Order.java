package pers.justin.kafka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author Justin
 * @Create 2021-11-18 17:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer orderId;
    private Integer productId;
    private Integer productNum;
    private Double orderAmount;
}
