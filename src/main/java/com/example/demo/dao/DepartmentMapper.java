package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DepartmentVo;

@Mapper
public interface DepartmentMapper {
	List<DepartmentVo> getDepartmentList();
}
