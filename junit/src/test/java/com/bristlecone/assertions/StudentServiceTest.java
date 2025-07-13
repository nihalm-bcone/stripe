package com.bristlecone.assertions;

import com.bristlecone.Student;
import com.bristlecone.StudentNotFoundException;
import com.bristlecone.StudentService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudentsTest(){

        StudentService studentService = new StudentService();

        List<Student> listOfStudents = studentService.getStudentList();

        boolean actualResult = listOfStudents.isEmpty();

        //assertTrue(actualResult);

        //Java8 : using Lambda
        assertTrue(() -> actualResult);

    }

    @Test
    public void getStudentsTestUsingAssertFalse(){

        StudentService studentService = new StudentService();

        List<Student> listOfStudents = studentService.getStudentList();

        boolean actualResult = listOfStudents.isEmpty();

        assertFalse(() -> actualResult); // This will fail test as expected was list should not be empty

    }

    @Test
    public void testAssertNull(){

        StudentService studentService = new StudentService();

        studentService.addStudent(new Student(1,"Nihal"));

        assertNull(studentService.getStudentById(1));


    }

    @Test
    public void testAssertNotNull(){

        StudentService studentService = new StudentService();

        studentService.addStudent(new Student(1,"Nihal"));

        assertNotNull(studentService.getStudentById(1));

    }

    @Test
    public void testAssertEquals(){
        StudentService studentService = new StudentService();

        Student student  = new Student(1,"Nihal");

        studentService.addStudent(student);

        assertEquals(student, studentService.getStudentById(1));
    }

    @Test
    public void testAssertNotEquals(){

        StudentService studentService = new StudentService();

        Student student  = new Student(1,"Nihal");

        studentService.addStudent(student);

        assertNotEquals(student, studentService.getStudentById(1));

    }

    @Test
    public void testAssertArrayEquals(){

        StudentService studentService = new StudentService();

        Student student  = new Student(1,"Nihal","IT");
        Student student2 = new Student(2,"Nameera","Medical");
        Student student3 = new Student(3,"Amina","IT");

        studentService.addStudent(student);
        studentService.addStudent(student2);
        studentService.addStudent(student3);

        String[] expectedStudents = {"Nihal","Amina"};
        String[] actualStudents = studentService.getStudentsByDepartment("IT");

        assertArrayEquals(expectedStudents, actualStudents);

    }

    @Test
    public void testAssertIterableEquals(){

        StudentService studentService = new StudentService();

        Student student  = new Student(1,"Nihal","IT");
        Student student2 = new Student(2,"Nameera","Medical");
        Student student3 = new Student(3,"Amina","IT");

        studentService.addStudent(student);
        studentService.addStudent(student2);
        studentService.addStudent(student3);

        String[] expectedStudents = {"Nihal","Amina"};
        String[] actualStudents = studentService.getStudentsByDepartment("IT");

        List<String> expectedStudentsList = Arrays.asList(expectedStudents);
        List<String> actualStudentsList = Arrays.asList(actualStudents);

        assertIterableEquals(expectedStudentsList, actualStudentsList);
    }

    @Test
    public void testAssertThrows(){

        StudentService studentService = new StudentService();

        assertThrows(StudentNotFoundException.class, () -> studentService.getStudentByName("Nihal"));
    }





}