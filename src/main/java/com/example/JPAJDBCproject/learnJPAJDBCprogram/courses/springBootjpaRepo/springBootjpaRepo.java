package com.example.JPAJDBCproject.learnJPAJDBCprogram.courses.springBootjpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.JPAJDBCproject.learnJPAJDBCprogram.courses.course;

import java.util.List;

public interface springBootjpaRepo extends JpaRepository<course, Long> {
    List<course> findByAuthor(String author);
    List<course>findByName(String name);


}




