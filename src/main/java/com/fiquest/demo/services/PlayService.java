package com.fiquest.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiquest.demo.models.Option;
import com.fiquest.demo.models.Question;
import com.fiquest.demo.repositories.OptionRepository;
import com.fiquest.demo.repositories.QuestionRepository;

@Service
public class PlayService {

	@Autowired
	private QuestionRepository qRepository;
	
	@Autowired
	private OptionRepository oRepository;
	
	public List<Question> findAllQuestions(){
		return qRepository.findAll();
	}
	
	public Optional<Question> findQuestionById(Long id) {
		return qRepository.findById(id);
	}
	
	public List<Option> optionsByQuestion(Long id){
		Optional<Question> question = qRepository.findById(id);
		return question.get().getOptions();
	}
	
	public void insertQuestion(Question question) {
		qRepository.save(question);
		oRepository.saveAll(question.getOptions());
	}
}
