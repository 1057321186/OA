package com.project.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.dao.AnswersMapper;
import com.project.dao.QuestionsMapper;
import com.project.pojo.Questions;




public class Ttest {
	

	
	@Test
	public void dao(){
		ApplicationContext context=new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		//1、获取持久层对象
		QuestionsMapper questionsMapper=context.getBean(QuestionsMapper.class);
		
		Questions questions=new Questions();
		questions.setTitle("吃饭没");
		questions.setDetaildesc("今天吃饭没？");
		//2、调用持久层方法
		int a=questionsMapper.addQuestion(questions);
		System.out.println(a);
	}
	
}
