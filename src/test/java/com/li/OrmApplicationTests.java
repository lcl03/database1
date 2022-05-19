package com.li;

import com.li.pojo.Score;
import com.li.pojo.student;
import com.li.server.studentMapper;
import com.li.server.studentMapperImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class OrmApplicationTests {
    @Autowired
    private studentMapperImpl studentMapper;

    @Test
    void contextLoads() {
      /*  List<student> studentList = studentMapper.query();
        for (student student : studentList) {
            System.out.println(student);*/

   /*     Map map=new HashMap<>();
        map.put("sid","000000001");
        map.put("name","一叶知秋");
        map.put("sex","牛");
        map.put("birthday","2001-01-01");
        map.put("classid","1001");
        studentMapper.update(map);*/
        List<Score> scoreList=studentMapper.query2();
        for(Score score :scoreList){
            System.out.println(score);
        }
        }



}
