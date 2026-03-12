package com.telusko.spring_data_jpa_ex.repository;

import com.telusko.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepo extends JpaRepository<Student, Integer> {

    @Query("select s from Student s where s.name= ?1")
    List<Student> findByName(String name);

//    @Query() is optional bcz jpa provides some default methods

    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);

}
