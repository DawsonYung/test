package com.yangdsh.controller;


import com.yangdsh.entity.AutoExchangeConfig;
import com.yangdsh.service.AutoExchanConService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/autoExchangeConfig")
public class AutoExchangeConfigController {
    @Autowired
    private AutoExchanConService autoExchanConService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addAutoExchanCon(AutoExchangeConfig autoExchangeConfig){
        return autoExchanConService.addAutoExchanConfig(autoExchangeConfig);
    }

    @RequestMapping(value = "/selectById", produces = {"application/json;charset=UTF-8"})
    public AutoExchangeConfig selectById(String id){

        Long pkey = Long.parseLong(id);
        AutoExchangeConfig autoExchangeConfig  = autoExchanConService.selectAutoInfoByID(pkey);
        return autoExchangeConfig;

    }

    @RequestMapping(value = "/uptById", produces = {"application/json;charset=UTF-8"})
    public int uptAutoExchanCon(AutoExchangeConfig autoExchangeConfig){
        return autoExchanConService.uptAutoExchanConfig(autoExchangeConfig);
    }

    @RequestMapping(value = "delById",produces = {"application/json;charset=UTF-8"})
    public int delAutoExchanCon(String id){
        Long pkey = Long.parseLong(id);
        int response = autoExchanConService.delAutoExchanConfig(pkey);
        return response;
    }
}
