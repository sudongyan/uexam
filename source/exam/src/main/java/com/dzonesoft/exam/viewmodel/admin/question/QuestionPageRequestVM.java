package com.dzonesoft.exam.viewmodel.admin.question;

import com.dzonesoft.exam.base.BasePage;
import lombok.Data;

@Data
public class QuestionPageRequestVM extends BasePage {

    private Integer id;
    private Integer level;
    private Integer subjectId;
    private Integer questionType;
}
