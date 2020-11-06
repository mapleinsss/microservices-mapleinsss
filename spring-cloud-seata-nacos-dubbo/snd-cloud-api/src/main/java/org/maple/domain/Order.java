package org.maple.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author mapleins
 */
@TableName("order_tbl")
@Data
public class Order {

     /*
        DROP TABLE IF EXISTS `order_tbl`;
        CREATE TABLE `order_tbl` (
          `id` int(11) NOT NULL AUTO_INCREMENT,
          `user_id` varchar(255) DEFAULT NULL,
          `commodity_code` varchar(255) DEFAULT NULL,
          `count` int(11) DEFAULT 0,
          `money` int(11) DEFAULT 0,
          PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;
}
