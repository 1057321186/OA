package com.project.pojo;

import java.util.Date;
import java.util.List;

public class Questions {
	private Integer id;

	private String title;

	private String detaildesc;

	private Integer answercount;

	private Date lastmodified;

	private List<Answers> answers;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetaildesc() {
		return detaildesc;
	}

	public void setDetaildesc(String detaildesc) {
		this.detaildesc = detaildesc;
	}

	public Integer getAnswercount() {
		return answercount;
	}

	public void setAnswercount(Integer answercount) {
		this.answercount = answercount;
	}

	public Date getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(Date lastmodified) {
		this.lastmodified = lastmodified;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
}