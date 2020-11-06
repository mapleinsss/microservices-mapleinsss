package org.maple.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author mapleins
 */
@Data
@TableName("account_tbl")
public class Account {
     /*
        DROP TABLE IF EXISTS `account_tbl`;
        CREATE TABLE `account_tbl` (
          `id` int(11) NOT NULL AUTO_INCREMENT,
          `user_id` varchar(255) DEFAULT NULL,
          `money` int(11) DEFAULT 0,
          PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
     */
     @TableId(value = "id",type = IdType.AUTO)
     private Integer id;
     private String userId;
     private Integer money;
}
