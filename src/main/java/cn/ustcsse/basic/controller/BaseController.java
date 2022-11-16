package cn.ustcsse.basic.controller;

import cn.ustcsse.basic.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    CourseService courseService;
    @Autowired
    ManagerService managerService;
    @Autowired
    MessageService messageService;
    @Autowired
    ScoreCountService scoreCountService;
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;
}
