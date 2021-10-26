package com.springboot.SpringBootRestApIHardcoded.entity;

public class Topic {

	private Integer id;
	
	private String topicName;

	private String description;
	
	public Topic() {
		
	}
	
	public Topic(int id, String topicName, String description) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.description = description;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", topicName=" + topicName + ", description=" + description + "]";
	}
	
}
