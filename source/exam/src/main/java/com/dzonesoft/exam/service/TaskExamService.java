package com.dzonesoft.exam.service;

import com.dzonesoft.exam.domain.TaskExam;
import com.dzonesoft.exam.domain.User;
import com.dzonesoft.exam.viewmodel.admin.task.TaskPageRequestVM;
import com.dzonesoft.exam.viewmodel.admin.task.TaskRequestVM;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TaskExamService extends BaseService<TaskExam> {

    PageInfo<TaskExam> page(TaskPageRequestVM requestVM);

    void edit(TaskRequestVM model, User user);

    TaskRequestVM taskExamToVM(Integer id);

    List<TaskExam> getByGradeLevel(Integer gradeLevel);
}
