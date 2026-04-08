package com.shopflow;


import com.shopflow.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.createStudent(1, "John");
        controller.createStudent(2, "Hunter");
        controller.viewStudent(1);
        controller.viewStudent(2);
    }
}