package com.example.renmuqingzi.mapper;

import com.example.renmuqingzi.pojo.TestServiceVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {
    List<TestServiceVO> test();
}
