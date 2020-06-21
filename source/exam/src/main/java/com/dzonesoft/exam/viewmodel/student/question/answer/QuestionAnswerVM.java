package com.dzonesoft.exam.viewmodel.student.question.answer;

import com.dzonesoft.exam.viewmodel.admin.question.QuestionEditRequestVM;
import com.dzonesoft.exam.viewmodel.student.exam.ExamPaperSubmitItemVM;
import lombok.Data;

@Data
public class QuestionAnswerVM {
    private QuestionEditRequestVM questionVM;
    private ExamPaperSubmitItemVM questionAnswerVM;
}
