package com.zhangci.entity;

import lombok.*;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * ClassName: Goods
 * <p>
 * Author: ZhangCi
 * Description: 购物车信息
 * Date: 2021/4/12 21:26
 * Version: 0.1
 * Since: JDK 1.8
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GoodsShopping implements Serializable {

    //唯一序列号
    private static final long serialVersionUID = -8524807077413374413L;

    private Goods goods;
    private Integer buyNum;
    private Float totalMoney;
}
