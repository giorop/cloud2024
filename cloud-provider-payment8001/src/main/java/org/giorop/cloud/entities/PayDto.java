package org.giorop.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author giorop
 * @date 2024/6/6_7:31
 * @description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PayDto implements Serializable {
    //Dto 为主体类的一个外观模式 只暴露部分数据
    private Integer id;
    private String payNo;
    private String orderNo;
    private Integer userId;
    private BigDecimal amount;
}
