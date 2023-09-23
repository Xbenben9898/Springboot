package com.javaproject1.learspringboot;

public class Course {
    private int courseID;
    private String CourseName;
    private double coursePrice;

    public Course(int courseID, String courseName, double coursePrice) {
        this.courseID = courseID;
        CourseName = courseName;
        this.coursePrice = coursePrice;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
