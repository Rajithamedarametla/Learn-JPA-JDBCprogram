package com.example.JPAJDBCproject.learnJPAJDBCprogram.course.jdbc;

import com.example.JPAJDBCproject.learnJPAJDBCprogram.courses.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class coursejdbcrepo {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUREY =
            """
                    insert into course(id,name,author)
                    values(?,?,?);
                                        
                    """;
    private static String DELETE_QUREY =
            """
                    delete from course
                    where id=?
                                        
                    """;
    private static String SELECT_QUREY =
            """
                    select* from course
                     where id=?
                                         
                     """;

    public void insert(course course) {
        springJdbcTemplate.update(INSERT_QUREY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteBYId(long id) {
        springJdbcTemplate.update(DELETE_QUREY, id);
    }

    public course findByID(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUREY,new BeanPropertyRowMapper<>(course.class) ,id);
    }



}