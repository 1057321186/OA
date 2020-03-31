package com.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.dao.QuestionsMapper;
import com.project.pojo.Answers;
import com.project.pojo.Questions;
import com.project.service.IQuestionService;

@Controller
public class QuestionController {
	
	
	@Autowired
	IQuestionService questionService;
	
	@Autowired
	QuestionsMapper questionMapper;
	
	
	
	//获取所有的问题
	@RequestMapping("getQuestions")
	@ResponseBody
	public List<Questions> allQuestions(){
		
		return questionService.getQuestions();
		
	}
	
	//添加问题
	@RequestMapping("addQuestion")
	public String add(Questions question) {
		System.out.println(question.getTitle()+","+question.getDetaildesc());
		questionService.addQuestion(question);
		return "/html/index.html";
	}
	


	
}
