package com.shopflow.controller;

import com.shopflow.data.model.Student;
import com.shopflow.services.StudentServices;

public class StudentController {
    private StudentServices service = new StudentServices();

    public void createStudent(int id, String name) {
        service.addStudent(id, name);
    }

    public void viewStudent(int id) {
        Student s = service.getStudent(id);
        System.out.println(s.name);
    }
}
