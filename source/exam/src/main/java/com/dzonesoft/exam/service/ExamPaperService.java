package com.dzonesoft.exam.service;

import com.dzonesoft.exam.domain.ExamPaper;
import com.dzonesoft.exam.domain.User;
import com.dzonesoft.exam.viewmodel.admin.exam.ExamPaperEditRequestVM;
import com.dzonesoft.exam.viewmodel.admin.exam.ExamPaperPageRequestVM;
import com.dzonesoft.exam.viewmodel.student.dashboard.PaperFilter;
import com.dzonesoft.exam.viewmodel.student.dashboard.PaperInfo;
import com.dzonesoft.exam.viewmodel.student.exam.ExamPaperPageVM;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ExamPaperService extends BaseService<ExamPaper> {

    PageInfo<ExamPaper> page(ExamPaperPageRequestVM requestVM);

    PageInfo<ExamPaper> taskExamPage(ExamPaperPageRequestVM requestVM);

    PageInfo<ExamPaper> studentPage(ExamPaperPageVM requestVM);

    ExamPaper savePaperFromVM(ExamPaperEditRequestVM examPaperEditRequestVM, User user);

    ExamPaperEditRequestVM examPaperToVM(Integer id);

    List<PaperInfo> indexPaper(PaperFilter paperFilter);

    Integer selectAllCount();

    List<Integer> selectMothCount();
}
