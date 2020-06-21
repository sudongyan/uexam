package com.dzonesoft.exam.viewmodel.admin.exam;

import com.dzonesoft.exam.base.BasePage;
import lombok.Data;

@Data
public class ExamPaperPageRequestVM extends BasePage {

    private Integer id;
    private Integer subjectId;
    private Integer level;
    private Integer paperType;
    private Integer taskExamId;
}
