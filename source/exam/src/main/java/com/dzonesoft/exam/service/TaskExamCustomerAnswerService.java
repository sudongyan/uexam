package com.dzonesoft.exam.service;

import com.dzonesoft.exam.domain.ExamPaper;
import com.dzonesoft.exam.domain.ExamPaperAnswer;
import com.dzonesoft.exam.domain.TaskExamCustomerAnswer;

import java.util.Date;
import java.util.List;

public interface TaskExamCustomerAnswerService extends BaseService<TaskExamCustomerAnswer> {

    void insertOrUpdate(ExamPaper examPaper, ExamPaperAnswer examPaperAnswer, Date now);

    TaskExamCustomerAnswer selectByTUid(Integer tid, Integer uid);

    List<TaskExamCustomerAnswer> selectByTUid(List<Integer> taskIds, Integer uid);
}
