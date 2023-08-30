package com.controller.Config;

public class GetConfig {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String course;
	private String description;
	public GetConfig(int id, String course, String description) {
		super();
		this.id = id;
		this.course = course;
		this.description = description;
	}
	public GetConfig() {
		
	}


}
