package com.dzonesoft.exam.base;


import com.dzonesoft.exam.context.WebContext;
import com.dzonesoft.exam.domain.User;
import com.dzonesoft.exam.utility.ModelMapperSingle;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author dzonesoft
 */
public class BaseApiController {
    protected final static String DEFAULT_PAGE_SIZE = "10";
    protected final static ModelMapper modelMapper = ModelMapperSingle.Instance();
    @Autowired
    protected WebContext webContext;

    protected User getCurrentUser() {
        return webContext.getCurrentUser();
    }
}
