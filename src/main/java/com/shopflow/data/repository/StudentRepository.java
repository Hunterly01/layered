package com.shopflow.data.repository;
import com.shopflow.data.model.Student;

import java.util.*;

public class StudentRepository {
    private Map<Integer, Student> db = new HashMap<>();

    public void save(Student student) {
        db.put(student.id, student);
    }

    public Student findById(int id) {
        return db.get(id);
    }
}
