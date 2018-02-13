package in.volkin.hiring.in.volkin.hiringtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.volkin.hiring.in.volkin.hiringtest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
