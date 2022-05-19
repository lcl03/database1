package com.li.pojo;

public class Course {
    private String classid;
    private  String classname;
    private int classtime;
    private int cent;

    public Course() {
    }

    public Course(String classid, String classname, int classtime, int cent) {
        this.classid = classid;
        this.classname = classname;
        this.classtime = classtime;
        this.cent = cent;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getClasstime() {
        return classtime;
    }

    public void setClasstime(int classtime) {
        this.classtime = classtime;
    }

    public int getCent() {
        return cent;
    }

    public void setCent(int cent) {
        this.cent = cent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "classid='" + classid + '\'' +
                ", classname='" + classname + '\'' +
                ", classtime=" + classtime +
                ", cent=" + cent +
                '}';
    }
}
