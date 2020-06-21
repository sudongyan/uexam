package com.dzonesoft.exam.controller.wx;

import com.dzonesoft.exam.context.WxContext;
import com.dzonesoft.exam.domain.User;
import com.dzonesoft.exam.domain.UserToken;
import com.dzonesoft.exam.utility.ModelMapperSingle;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseWXApiController {
    protected final static ModelMapper modelMapper = ModelMapperSingle.Instance();
    @Autowired
    private WxContext wxContext;

    protected User getCurrentUser() {
        return wxContext.getCurrentUser();
    }

    protected UserToken getUserToken() {
        return wxContext.getCurrentUserToken();
    }
}
