package org.maple.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author mapleins
 * 库存表
 */
@TableName("storage_tbl")
@Data
public class Storage {

     /*
        DROP TABLE IF EXISTS `storage_tbl`;
        CREATE TABLE `storage_tbl` (
          `id` int(11) NOT NULL AUTO_INCREMENT,
          `commodity_code` varchar(255) DEFAULT NULL,
          `count` int(11) DEFAULT 0,
          PRIMARY KEY (`id`),
          UNIQUE KEY (`commodity_code`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String commodityCode;
    private Integer count;
}
