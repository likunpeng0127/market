package com.itheima.stock.pojo.mapper;

import com.itheima.stock.pojo.entity.StockBusiness;

/**
* @author Administrator
* @description 针对表【stock_business(主营业务表)】的数据库操作Mapper
* @createDate 2025-06-28 11:15:46
* @Entity com.itheima.stock.pojo.entity.StockBusiness
*/
public interface StockBusinessMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StockBusiness record);

    int insertSelective(StockBusiness record);

    StockBusiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StockBusiness record);

    int updateByPrimaryKey(StockBusiness record);

}
