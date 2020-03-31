package com.project.dao;

import org.apache.ibatis.annotations.Select;

import com.project.pojo.Answers;

public interface AnswersMapper {
	
	//通过qid查找回答
	@Select("select * from answers where  qid=#{id}")
	Answers findAnswers(Integer id);
	

}