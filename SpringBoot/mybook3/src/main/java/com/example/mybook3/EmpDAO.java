package com.example.mybook3;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmpDAO {
	
	public List selectEmp();
}
