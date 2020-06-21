package com.dzonesoft.exam.controller.student;

import com.dzonesoft.exam.base.BaseApiController;
import com.dzonesoft.exam.base.RestResponse;
import com.dzonesoft.exam.domain.ExamPaper;
import com.dzonesoft.exam.service.ExamPaperAnswerService;
import com.dzonesoft.exam.service.ExamPaperService;
import com.dzonesoft.exam.utility.DateTimeUtil;
import com.dzonesoft.exam.utility.PageInfoHelper;
import com.dzonesoft.exam.viewmodel.admin.exam.ExamPaperEditRequestVM;
import com.dzonesoft.exam.viewmodel.student.exam.ExamPaperPageResponseVM;
import com.dzonesoft.exam.viewmodel.student.exam.ExamPaperPageVM;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController("StudentExamPaperController")
@RequestMapping(value = "/api/student/exam/paper")
@AllArgsConstructor
public class ExamPaperController extends BaseApiController {

    private final ExamPaperService examPaperService;
    private final ExamPaperAnswerService examPaperAnswerService;
    private final ApplicationEventPublisher eventPublisher;


    @RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    public RestResponse<ExamPaperEditRequestVM> select(@PathVariable Integer id) {
        ExamPaperEditRequestVM vm = examPaperService.examPaperToVM(id);
        return RestResponse.ok(vm);
    }


    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    public RestResponse<PageInfo<ExamPaperPageResponseVM>> pageList(@RequestBody @Valid ExamPaperPageVM model) {
        PageInfo<ExamPaper> pageInfo = examPaperService.studentPage(model);
        PageInfo<ExamPaperPageResponseVM> page = PageInfoHelper.copyMap(pageInfo, e -> {
            ExamPaperPageResponseVM vm = modelMapper.map(e, ExamPaperPageResponseVM.class);
            vm.setCreateTime(DateTimeUtil.dateFormat(e.getCreateTime()));
            return vm;
        });
        return RestResponse.ok(page);
    }
}
