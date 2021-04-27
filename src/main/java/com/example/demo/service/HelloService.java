package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DepartmentMapper;
import com.example.demo.vo.DepartmentVo;

@Component
public class HelloService {

	@Autowired
    DepartmentMapper departmentMapper;
	
	@Value("${name:World}")
	private String name;

	public String getHelloMessage() {
		List<DepartmentVo> departmentVoList =  departmentMapper.getDepartmentList();
        StringBuilder ret = new StringBuilder();
        for (DepartmentVo departmentVo : departmentVoList)
            ret.append(departmentVo.toString());
        
        return ret.toString();
	}

}