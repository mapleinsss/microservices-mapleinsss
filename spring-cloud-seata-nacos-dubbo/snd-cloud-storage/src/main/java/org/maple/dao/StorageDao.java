package org.maple.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.maple.domain.Storage;

/**
 * @author mapleins
 */
public interface StorageDao extends BaseMapper<Storage> {

    @Update("update storage_tbl set count = count - #{count} where commodityCode = #{commodityCode} and count >= #{count}")
    void deduct(@Param("commodityCode") String commodityCode, @Param("count") int count);
}
