package in.volkin.hiring.in.volkin.hiringtest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	private int question_id;
	private String question;
	private String question_type;
	
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestion_type() {
		return question_type;
	}
	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}
		
}
