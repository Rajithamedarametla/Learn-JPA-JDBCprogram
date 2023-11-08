package com.example.JPAJDBCproject.learnJPAJDBCprogram.courses.Jpa;

import com.example.JPAJDBCproject.learnJPAJDBCprogram.courses.course;

import com.example.JPAJDBCproject.learnJPAJDBCprogram.courses.springBootjpaRepo.springBootjpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component


public class courseCommandLineRunner implements CommandLineRunner {
   // @Autowired
   // private courseJpaRepo repository;
    @Autowired
    private springBootjpaRepo repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save((new course(1,"oracle k","sql")));
        repository.save((new course(2,"java h","stack")));
        repository.save((new course(3,"aws n","cloud")));

        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("bob min"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("java"));
        System.out.println(repository.findByName(""));


    }
}
