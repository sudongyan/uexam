package com.dzonesoft.exam.viewmodel.admin.user;

import com.dzonesoft.exam.base.BasePage;
import lombok.Data;

/**
 * @author dzonesoft
 */

@Data
public class UserEventPageRequestVM extends BasePage {

    private Integer userId;

    private String userName;

}
