package com.dzonesoft.exam.controller.student;

import com.dzonesoft.exam.base.BaseApiController;
import com.dzonesoft.exam.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("StudentQuestionController")
@RequestMapping(value = "/api/student/question")
@AllArgsConstructor
public class QuestionController extends BaseApiController {

    private final QuestionService questionService;


}
