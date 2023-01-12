package net.javaguides.hibernate.dao;

import java.util.List;

import net.javaguides.hibernate.model.Student;

public interface IStudentDao {

 void saveStudent(Student student);

 void updateStudent(Student st);

 void getStudentById(int id);

 List<Student> getAllStudents();

 void deleteStudent(int id);

}