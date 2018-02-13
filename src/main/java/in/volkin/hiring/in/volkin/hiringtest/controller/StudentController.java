package in.volkin.hiring.in.volkin.hiringtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.volkin.hiring.in.volkin.hiringtest.model.Student;
import in.volkin.hiring.in.volkin.hiringtest.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/student/{id}")
	public Student findStudent(@PathVariable int id) {
		return studentRepository.findOne(id);
	}
	
	@PostMapping("/student")
	public int svaeStudent(Student student) {
		return studentRepository.save(student).getStudent_id();
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(int id) {
		studentRepository.delete(id);
	}
		
}