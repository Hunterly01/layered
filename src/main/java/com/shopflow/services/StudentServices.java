package com.shopflow.services;

import com.shopflow.data.model.Student;
import com.shopflow.data.repository.StudentRepository;

public class StudentServices {

    private StudentRepository repo = new StudentRepository();

    public void addStudent(int id, String name) {
            repo.save(new Student(id, name));
    }

    public Student getStudent(int id) {
        return repo.findById(id);

    }
}
