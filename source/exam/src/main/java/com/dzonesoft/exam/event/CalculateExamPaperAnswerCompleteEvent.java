package com.dzonesoft.exam.event;

import com.dzonesoft.exam.domain.ExamPaperAnswerInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @author dzonesoft
 */
public class CalculateExamPaperAnswerCompleteEvent extends ApplicationEvent {


    private final ExamPaperAnswerInfo examPaperAnswerInfo;


    public CalculateExamPaperAnswerCompleteEvent(final ExamPaperAnswerInfo examPaperAnswerInfo) {
        super(examPaperAnswerInfo);
        this.examPaperAnswerInfo = examPaperAnswerInfo;
    }

    public ExamPaperAnswerInfo getExamPaperAnswerInfo() {
        return examPaperAnswerInfo;
    }

}
