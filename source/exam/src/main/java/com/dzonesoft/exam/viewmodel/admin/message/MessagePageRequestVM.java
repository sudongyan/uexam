package com.dzonesoft.exam.viewmodel.admin.message;

import com.dzonesoft.exam.base.BasePage;
import lombok.Data;

@Data
public class MessagePageRequestVM extends BasePage {
    private String sendUserName;
}
