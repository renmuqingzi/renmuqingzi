package com.example.renmuqingzi.controller;

import com.alibaba.fastjson.JSON;
import com.example.renmuqingzi.pojo.TestServiceVO;
import com.example.renmuqingzi.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/find")
    @ResponseBody
    public String testReturn() {
        List<TestServiceVO> list = testService.test();
        return JSON.toJSONString(list);
    }
}
