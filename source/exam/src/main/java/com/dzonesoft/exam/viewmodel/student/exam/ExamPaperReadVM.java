package com.dzonesoft.exam.viewmodel.student.exam;

import com.dzonesoft.exam.viewmodel.admin.exam.ExamPaperEditRequestVM;
import lombok.Data;

@Data
public class ExamPaperReadVM {
    private ExamPaperEditRequestVM paper;
    private ExamPaperSubmitVM answer;
}
