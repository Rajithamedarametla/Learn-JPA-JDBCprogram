package com.example.JPAJDBCproject.learnJPAJDBCprogram.courses.Jpa;

import com.example.JPAJDBCproject.learnJPAJDBCprogram.courses.course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional

public class courseJpaRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(course course) {
        entityManager.merge(course);

    }

    public course findById(long id) {
       return entityManager.find(course.class, id);

    }
    public void  deleteById(long id){
        course course =entityManager.find(course.class,id);
        entityManager.remove(course);
    }

}
