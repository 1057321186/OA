package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AnswersMapper;
import com.project.dao.QuestionsMapper;
import com.project.pojo.Questions;
import com.project.service.IQuestionService;

@Service
public class IQuestionServiceImpl implements IQuestionService{
	
	@Autowired
	QuestionsMapper questionsMapper;

	//获取所有问题
	public List<Questions> getQuestions() {
	
		//return questionsMapper.getAllQuestions();
		return questionsMapper.selectAllQuestion();
	}
	//提交问题
	public void  addQuestion(Questions question) {
		
		 questionsMapper.addQuestion(question);
		
	}
	
	

	
	
	
	
}
