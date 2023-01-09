package com.fiquest.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiquest.demo.models.Question;
import com.fiquest.demo.services.PlayService;

@RestController
@RequestMapping(value="/questions")
public class PlayController {

	@Autowired
	private PlayService service;
	
	@GetMapping
	public ResponseEntity<List<Question>> findAll(){
		List<Question> list = service.findAllQuestions();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<Question>insertQuestion(@RequestBody Question question){
		service.insertQuestion(question);
		return ResponseEntity.ok().body(question);
	
	}
}
