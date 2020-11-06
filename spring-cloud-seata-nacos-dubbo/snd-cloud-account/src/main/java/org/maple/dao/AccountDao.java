package org.maple.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.maple.domain.Account;

/**
 * @author mapleins
 */
public interface AccountDao extends BaseMapper<Account> {

    @Update("update account_tbl set money = money - #{money} where user_id = #{userId} and money > 0")
    void debit(@Param("money") int money, @Param("userId") String userId);
}
