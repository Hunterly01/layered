package com.shopflow.data.repository;
import com.shopflow.data.model.Student;

import java.util.*;

public class StudentRepository {
    private Map<Integer, Student> database = new HashMap<>();

    public void save(Student student) {
        database.put(student.id, student);
    }

    public Student findById(int id) {
        return database.get(id);
    }
}
