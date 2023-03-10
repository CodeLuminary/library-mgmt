package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private TopicService topicService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "Hello world";
	}

	@RequestMapping("/topics")
	public List<TopicList> topics(){
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public TopicList getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
}
