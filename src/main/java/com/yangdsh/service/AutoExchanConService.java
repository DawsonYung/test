package com.yangdsh.service;

import com.yangdsh.entity.AutoExchangeConfig;

public interface AutoExchanConService {

    int addAutoExchanConfig(AutoExchangeConfig autoExchangeConfig);

    AutoExchangeConfig selectAutoInfoByID(Long id);

    int uptAutoExchanConfig(AutoExchangeConfig autoExchangeConfig);

    int delAutoExchanConfig(Long id);

}
