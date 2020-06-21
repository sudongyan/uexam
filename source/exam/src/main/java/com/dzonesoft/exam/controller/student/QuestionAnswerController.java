package com.dzonesoft.exam.controller.student;

import com.dzonesoft.exam.base.BaseApiController;
import com.dzonesoft.exam.base.RestResponse;
import com.dzonesoft.exam.domain.ExamPaperQuestionCustomerAnswer;
import com.dzonesoft.exam.domain.Subject;
import com.dzonesoft.exam.domain.TextContent;
import com.dzonesoft.exam.domain.question.QuestionObject;
import com.dzonesoft.exam.service.ExamPaperQuestionCustomerAnswerService;
import com.dzonesoft.exam.service.QuestionService;
import com.dzonesoft.exam.service.SubjectService;
import com.dzonesoft.exam.service.TextContentService;
import com.dzonesoft.exam.utility.DateTimeUtil;
import com.dzonesoft.exam.utility.HtmlUtil;
import com.dzonesoft.exam.utility.JsonUtil;
import com.dzonesoft.exam.utility.PageInfoHelper;
import com.dzonesoft.exam.viewmodel.admin.question.QuestionEditRequestVM;
import com.dzonesoft.exam.viewmodel.student.exam.ExamPaperSubmitItemVM;
import com.dzonesoft.exam.viewmodel.student.question.answer.QuestionAnswerVM;
import com.dzonesoft.exam.viewmodel.student.question.answer.QuestionPageStudentRequestVM;
import com.dzonesoft.exam.viewmodel.student.question.answer.QuestionPageStudentResponseVM;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("StudentQuestionAnswerController")
@RequestMapping(value = "/api/student/question/answer")
@AllArgsConstructor
public class QuestionAnswerController extends BaseApiController {

    private final ExamPaperQuestionCustomerAnswerService examPaperQuestionCustomerAnswerService;
    private final QuestionService questionService;
    private final TextContentService textContentService;
    private final SubjectService subjectService;

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public RestResponse<PageInfo<QuestionPageStudentResponseVM>> pageList(@RequestBody QuestionPageStudentRequestVM model) {
        model.setCreateUser(getCurrentUser().getId());
        PageInfo<ExamPaperQuestionCustomerAnswer> pageInfo = examPaperQuestionCustomerAnswerService.studentPage(model);
        PageInfo<QuestionPageStudentResponseVM> page = PageInfoHelper.copyMap(pageInfo, q -> {
            Subject subject = subjectService.selectById(q.getSubjectId());
            QuestionPageStudentResponseVM vm = modelMapper.map(q, QuestionPageStudentResponseVM.class);
            vm.setCreateTime(DateTimeUtil.dateFormat(q.getCreateTime()));
            TextContent textContent = textContentService.selectById(q.getQuestionTextContentId());
            QuestionObject questionObject = JsonUtil.toJsonObject(textContent.getContent(), QuestionObject.class);
            String clearHtml = HtmlUtil.clear(questionObject.getTitleContent());
            vm.setShortTitle(clearHtml);
            vm.setSubjectName(subject.getName());
            return vm;
        });
        return RestResponse.ok(page);
    }


    @RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    public RestResponse<QuestionAnswerVM> select(@PathVariable Integer id) {
        QuestionAnswerVM vm = new QuestionAnswerVM();
        ExamPaperQuestionCustomerAnswer examPaperQuestionCustomerAnswer = examPaperQuestionCustomerAnswerService.selectById(id);
        ExamPaperSubmitItemVM questionAnswerVM = examPaperQuestionCustomerAnswerService.examPaperQuestionCustomerAnswerToVM(examPaperQuestionCustomerAnswer);
        QuestionEditRequestVM questionVM = questionService.getQuestionEditRequestVM(examPaperQuestionCustomerAnswer.getQuestionId());
        vm.setQuestionVM(questionVM);
        vm.setQuestionAnswerVM(questionAnswerVM);
        return RestResponse.ok(vm);
    }

}
