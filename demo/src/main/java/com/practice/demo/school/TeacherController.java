package com.practice.demo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepo;

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        List<Teacher > teacherList = new ArrayList<Teacher>();
        teacherList.add(new Teacher(4,"Mary Johnson", 30, "English") );
        teacherList.add(new Teacher(5,"Donald John", 35, "Geography"));
        teacherList.add(new Teacher(6,"Gail Jude", 27, "Chemistry"));
        return teacherList;
    }
    //@GetMapping ("/teachers")
    //public String createTeacher(Teacher teacher) {
       // return "teacher";
   // }
    @PostMapping("/teachers/newteacher")
    public void addPerson(@RequestBody Teacher  teacher){
        //Just has a Sysout stmt, a real world application would save this record to the database
        //System.out.println("Saving teacher information");

    }


}
