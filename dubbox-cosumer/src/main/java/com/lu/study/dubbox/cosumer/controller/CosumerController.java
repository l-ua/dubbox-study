package com.lu.study.dubbox.cosumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lu.study.domain.UserInfo;
import com.lu.study.interfaceclient.DemoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @autor 10758
 * @system dubbox-study
 * @Time 2018/6/2
 */
@RestController
@RequestMapping("/cosumer")
public class CosumerController {
    @Reference
    private DemoService demoService;

    @PostMapping(path = "/get-users")
    public List<UserInfo> getUsers(@RequestBody UserInfo userInfo) {
        return demoService.getUserListByCondition(userInfo);
    }
}
