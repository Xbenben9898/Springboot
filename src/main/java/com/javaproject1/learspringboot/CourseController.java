package com.javaproject1.learspringboot;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CourseController extends Course{

    private ArrayList<Course> Listofcoursr;
    public CourseController(int courseID, String courseName, double coursePrice) {
        super(courseID, courseName, coursePrice);
    }


    public ArrayList<Course> getListofcoursr() {
        return Listofcoursr;
    }

    public void setListofcoursr(ArrayList<Course> listofcoursr) {
        Listofcoursr = listofcoursr;
    }
}
