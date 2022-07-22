package com.abdullahcicekli.controller;


import com.abdullahcicekli.bean.BeanDto;
import com.abdullahcicekli.dto.BeanConfig;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@RestController()
public class BeanController {
    @Autowired
    BeanConfig beanConfig;


    @GetMapping("/bean/beandto")
    @ResponseBody // html olmadan ekranda göster
    public BeanDto getBeanDto(){
        return beanConfig.beanDto();
    }


    public static void main(String[] args) {
        BeanController beanController = new BeanController();
        System.out.println(beanController);
    }
}
