package com.spbtutorial.jpahibrenate.dao;

import com.spbtutorial.jpahibrenate.entity.Student;

public interface StudentDOA {

    void saveStudent(Student student);

    Student getStudentById(Long id);

}
