package com.dzonesoft.exam.service;

import com.dzonesoft.exam.domain.UserEventLog;
import com.dzonesoft.exam.viewmodel.admin.user.UserEventPageRequestVM;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserEventLogService extends BaseService<UserEventLog> {

    List<UserEventLog> getUserEventLogByUserId(Integer id);

    PageInfo<UserEventLog> page(UserEventPageRequestVM requestVM);

    List<Integer> selectMothCount();
}
