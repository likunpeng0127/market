package com.itheima.stock.pojo.mapper;

import com.itheima.stock.pojo.entity.StockBlockRtInfo;

/**
* @author Administrator
* @description 针对表【stock_block_rt_info(股票板块详情信息表)】的数据库操作Mapper
* @createDate 2025-06-28 11:15:46
* @Entity com.itheima.stock.pojo.entity.StockBlockRtInfo
*/
public interface StockBlockRtInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StockBlockRtInfo record);

    int insertSelective(StockBlockRtInfo record);

    StockBlockRtInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StockBlockRtInfo record);

    int updateByPrimaryKey(StockBlockRtInfo record);

}
