package com.project.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.project.pojo.Questions;

public interface IQuestionService {
	
	//获取所有的问题
	List<Questions> getQuestions();

	//添加问题
	void addQuestion(Questions question);

}
