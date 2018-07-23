package com.yangdsh.mapper;

import com.yangdsh.entity.AutoExchangeConfig;

import java.util.List;

public interface AutoExchangeConfigMapper {

    int insert(AutoExchangeConfig args1);

    AutoExchangeConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKey(AutoExchangeConfig args1);


    int deleteByPrimaryKey(Long id);

//    int insertSelective(AutoExchangeConfig args1);

//    int updateByPrimaryKeySelective(AutoExchangeConfig args1);

}
