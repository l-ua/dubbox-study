package com.lu.study.dubbox.provider.services.impl;

import com.lu.study.domain.UserInfo;
import com.lu.study.interfaceclient.DemoService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor 10758
 * @system dubbox-study
 * @Time 2018/6/2
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public List<UserInfo> getUserListByCondition(UserInfo userInfo) {
        List<UserInfo> responeList = new ArrayList<>();
        responeList.add(userInfo);
        return responeList;
    }
}
