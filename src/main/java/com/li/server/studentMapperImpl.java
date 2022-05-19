package com.li.server;

import com.li.dao.Mapper;
import com.li.pojo.Score;
import com.li.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class studentMapperImpl implements studentMapper{
    @Autowired
    private Mapper mapper;
    public List<student> query() {
        return mapper.query();
    }

    @Override
    public int add(Map map) {
        return mapper.add(map);
    }

    @Override
    public int delete(String sid) {
        return mapper.delete(sid);
    }

    @Override
    public List<Score> query2() {
        return mapper.query2();
    }

    @Override
    public int update(Map map) {
        return mapper.update(map);
    }
}
