package com.dzonesoft.exam.viewmodel.admin.education;

import com.dzonesoft.exam.viewmodel.BaseVM;
import lombok.Data;

@Data
public class SubjectResponseVM extends BaseVM {
    private Integer id;

    private String name;

    private Integer level;

    private String levelName;
}
