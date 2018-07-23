package com.yangdsh.service.impl;

import com.yangdsh.entity.AutoExchangeConfig;
import com.yangdsh.mapper.AutoExchangeConfigMapper;
import com.yangdsh.service.AutoExchanConService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "IAutoExchanConService")
public class AutoExchanConServiceImpl implements AutoExchanConService {
    @Autowired
    private AutoExchangeConfigMapper autoExchangeConfigMapper;

    @Override
    public int addAutoExchanConfig(AutoExchangeConfig autoExchangeConfig) {

        return autoExchangeConfigMapper.insert(autoExchangeConfig);
    }

    @Override
    public AutoExchangeConfig selectAutoInfoByID(Long id) {
        return autoExchangeConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public int uptAutoExchanConfig(AutoExchangeConfig autoExchangeConfig) {
        return autoExchangeConfigMapper.updateByPrimaryKey(autoExchangeConfig);
    }

    @Override
    public int delAutoExchanConfig(Long id) {
        return autoExchangeConfigMapper.deleteByPrimaryKey(id);
    }

}
