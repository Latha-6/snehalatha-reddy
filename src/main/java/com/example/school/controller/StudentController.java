package com.example.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.bind.annotation.*;
import java.util.*;


import com.example.school.model.Srvice Student;
import com.example.school.service.StudentH2Services;

@RestController
public class  StudentController{
@Autowired 
private class StudentH2Service studentService; 

@GetMapping("/students") 
public ArrayList<Student> getStudents(){
return studentService.getStudents();
}
@GetMapping("/student/{studentId}") 
public Student getStudentById(@PathVariable("studentId") int studentId){
return studentService.getStudentById(studentId);
}
@PostMapping("/students") 
public Student addStudent(@RequestBody Student student){
return studentService.addStudent(student);
}

@PostMapping("/student/bulk") 

public String addMultipleStudent(@RequestBody ArrayList<Student> studenstList) {
return studentService.addMultipleStudents(studentsList);
}
@PutMapping("/students/{studentId}") 
public Student updateStudent(@PathVariable("studentId") int studentId,@RequestBody Student student){
return studentService.updateStudent(studentId,student); 
}
@DeleteMapping("/students/{studentId}") 
public void deleteStudent(@PathVariable int studentId){
studentService.deletestudent(studentId);
}
}