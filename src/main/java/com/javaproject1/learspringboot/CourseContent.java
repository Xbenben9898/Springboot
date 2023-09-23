package com.javaproject1.learspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController

public class CourseContent {


    @RequestMapping("/getcourses")
    public ArrayList helloworld(){

        CourseController course;
        ArrayList<Course> mylisofcourses =  new ArrayList<Course>();

        mylisofcourses.add(new Course(1,"JAVA", 100));
        mylisofcourses.add(new Course(1,"PYTHON", 100));
        mylisofcourses.add(new Course(1,"PYTHON", 100));
        mylisofcourses.add(new Course(1,"PYTHON", 100));

        return  mylisofcourses;





    }



}
