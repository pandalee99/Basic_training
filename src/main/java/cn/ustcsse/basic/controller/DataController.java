package cn.ustcsse.basic.controller;


import cn.ustcsse.basic.domain.Result;
import cn.ustcsse.basic.domain.ResultT;
import cn.ustcsse.basic.domain.Student;

import cn.ustcsse.basic.domain.Teacher;
import io.swagger.models.auth.In;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RestController
public class DataController extends BaseController{

    @GetMapping("/user/page")
    @ResponseBody
    public Result userPage(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize,@RequestParam("username") String username){

        if(Objects.equals(username, "")){
            List<Student> students = studentService.find();
            Result result = new Result();
            result.setRecords(students.subList((pageNum-1)*pageSize,pageNum*pageSize));
            result.setTotal(students.size());
            return result;
        }else {
            List<Student> students=new ArrayList<>();

            Student student = studentService.selectByPrimaryKey(Long.valueOf(username));
            Result result = new Result();
            students.add(student);
            result.setRecords(students);
            result.setTotal(1);
            return result;
        }


    }
    @RequestMapping("/user/{id}")
    public String del(@PathVariable("id") Long id){
        if (studentService.deleteByPrimaryKey(id)!=0){
            return "success";
        }else {
 
            return null;
        }
    }

    @PostMapping("/user")
    public String save(@Validated @RequestBody Student student, HttpServletResponse response){
        if (studentService.updateByPrimaryKey(student)!=0){
            return "success";
        }else {
            return null;
        }
    }


    @GetMapping("/user/teacher")
    @ResponseBody
    public ResultT userTeacher(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize,@RequestParam("username") String username){
        if(Objects.equals(username, "")){
            List<Teacher> t = teacherService.find();
            ResultT result = new ResultT();
            result.setRecords(t.subList((pageNum-1)*pageSize,pageNum*pageSize));
            result.setTotal(t.size());
            return result;

        }else {
            List<Teacher> teachers=new ArrayList<>();

            Teacher teacher = teacherService.selectByPrimaryKey(Long.valueOf(username));
            ResultT resultT = new ResultT();
            teachers.add(teacher);
            resultT.setRecords(teachers);
            resultT.setTotal(1);
            return resultT;
        }


    }

    @RequestMapping("/userT/{id}")
    public String delT(@PathVariable("id") Long id){
        if (teacherService.deleteByPrimaryKey(id)!=0){
            return "success";
        }else {

            return null;
        }
    }

    @PostMapping("/userT")
    public String saveT(@Validated @RequestBody Teacher teacher, HttpServletResponse response){

        if (teacherService.updateByPrimaryKey(teacher)!=0){
            return "success";
        }else {
            return null;
        }
    }
}
