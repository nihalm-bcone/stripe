package com.bristlecone;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student getStudentById(int studentId) {
        return studentList.stream().filter((student) -> student.getId() == studentId)
                .findFirst().orElse(null);
    }

    public String[] getStudentsByDepartment(String department) {

        return studentList.stream().filter((student) -> student.getDepartment().equals(department))
                .map(student -> student.getName())
                .toArray(String[]::new);

    }

    public Student getStudentByName(String studentName) {

        return studentList.stream().filter((student) -> student.getName().equals(studentName))
                .findFirst().orElseThrow(() -> new StudentNotFoundException(studentName + " not found"));
    }
}
