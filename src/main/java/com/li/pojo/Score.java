package com.li.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Score {
    private String sid;
    private String classid;
    private int grade;
    private student student;
    private Course course;
    public Score() {
    }
}
