package com.lu.study.interfaceclient;

import com.lu.study.domain.UserInfo;

import java.util.List;

/**
 * @autor 10758
 * @system dubbox-study
 * @Time 2018/6/2
 */
public interface DemoService {

    List<UserInfo> getUserListByCondition(UserInfo userInfo);

}
