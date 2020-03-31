package com.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.project.pojo.Questions;

public interface QuestionsMapper {
	
	
	//一对多:一个问题对应多个回答
	//使用获取所有的问题
	@Select("select * from questions")
    @Results({
    	@Result(id=true,column="id",property="id"),
		@Result(column="title",property="title"),
		@Result(column="detailDesc",property="detaildesc"),
		@Result(column="answerCount",property="answercount"),
		@Result(column="lastModified",property="lastmodified"),
		@Result(column="id",property="answers",
           many = @Many(
        		 //二次查询，跳转到另外一个sql语句，写方法的包路径
                   select="com.project.dao.AnswersMapper.findAnswers",
                   fetchType=FetchType.LAZY
        		   )
        )
    })
	List<Questions> selectAllQuestion();


	//添加问题
	@Insert("insert into questions values(default,#{title},#{detaildesc},default,NOW())")
	public int addQuestion(Questions question);
    



}