package com.li.server;

import com.li.pojo.Score;
import com.li.pojo.student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface studentMapper {
    List<student> query();
    int add(Map map);
    int delete(String sid);
    int update(Map map);
    List<Score> query2();

}
