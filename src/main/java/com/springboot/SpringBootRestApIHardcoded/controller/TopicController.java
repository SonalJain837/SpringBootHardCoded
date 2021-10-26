package com.springboot.SpringBootRestApIHardcoded.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.SpringBootRestApIHardcoded.entity.Topic;
import com.springboot.SpringBootRestApIHardcoded.service.TopicService;

@Controller
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@PostMapping("/topic")
	public ResponseEntity<Object> createUser(@RequestBody Topic topic) {
		Topic saveTopic = topicService.save(topic);
	
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveTopic.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}
	@GetMapping("/topic")
	public @ResponseBody <Topic> List<Topic> retrieveAllUsers() {
		return (List<Topic>) topicService.findAll();
	}
	}
	
