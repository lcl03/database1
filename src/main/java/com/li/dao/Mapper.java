package com.li.dao;

import com.li.pojo.Score;
import com.li.pojo.student;


import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {
    List<student> query();
    int add(Map map);
    int delete(String sid);
    int update(Map map);
    List<Score> query2();

}
