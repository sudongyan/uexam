package com.dzonesoft.exam.viewmodel.admin.user;

import com.dzonesoft.exam.base.BasePage;
import lombok.Data;

/**
 * @author dzonesoft
 */

@Data
public class UserPageRequestVM extends BasePage {

    private String userName;
    private Integer role;

}
