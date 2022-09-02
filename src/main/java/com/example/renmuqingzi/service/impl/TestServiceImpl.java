package com.example.renmuqingzi.service.impl;

import com.example.renmuqingzi.mapper.TestMapper;
import com.example.renmuqingzi.pojo.TestServiceVO;
import com.example.renmuqingzi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestServiceVO> test() {
        return testMapper.test();
    }
}
