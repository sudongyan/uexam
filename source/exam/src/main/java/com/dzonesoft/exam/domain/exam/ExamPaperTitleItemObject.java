package com.dzonesoft.exam.domain.exam;

import lombok.Data;

import java.util.List;

@Data
public class ExamPaperTitleItemObject {

    private String name;

    private List<ExamPaperQuestionItemObject> questionItems;
}
