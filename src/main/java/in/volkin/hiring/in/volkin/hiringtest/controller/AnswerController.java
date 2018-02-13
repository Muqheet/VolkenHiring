package in.volkin.hiring.in.volkin.hiringtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.volkin.hiring.in.volkin.hiringtest.model.Answer;
import in.volkin.hiring.in.volkin.hiringtest.repository.AnswerRepository;

@RestController
public class AnswerController {
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@PostMapping("/answer")
	public void submitAnswer(Answer answer) {
		answerRepository.save(answer);
	}
	
	@DeleteMapping("/answer/{id}")
	public void deleteAnswer(int id) {
		answerRepository.delete(id);
	}
}