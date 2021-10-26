package com.springboot.SpringBootRestApIHardcoded.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.SpringBootRestApIHardcoded.entity.Topic;

@Component
public class TopicService {

	private static List<Topic> topics = new ArrayList<>();
	private static int topicCount =3;
	static {
		topics.add(new Topic(1, "Java", "technology"));
		topics.add(new Topic(2, "Docker", "container"));
		topics.add(new Topic(3, "spring", "framework"));
	}
	
	public Topic save(Topic topic) {
		if(topic.getId() == 0) {
			topic.setId(++topicCount);
		}
		topics.add(topic);
		return topic;
	}
	
	public List<Topic> findAll() {
		return topics;
	}
}
