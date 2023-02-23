package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<TopicList> topics = Arrays.asList(
            new TopicList("1", "OOP", "Object oriented programming"),
				new TopicList("2", "Functional Programming", "Introduction to functional programming")
		);

	public List<TopicList> getAllTopics(){
		return topics;
	}

	public TopicList getTopic(String id){
		return topics.stream().filter(x -> x.getId().equals(id)).findFirst().get();
	}
}
