package net.javaguides.hibernate.main;

import java.util.List;

import net.javaguides.hibernate.dao.IStudentDao;
import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.model.Student;

public class App {

    public static void main(String[] args) {

        IStudentDao studentDao = new StudentDao();

        // test saveStudent
//        Student student = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//        studentDao.saveStudent(student);

        // test updateStudent
//        Student st = new Student();
//        studentDao.updateStudent(st);

        // test getStudentById
 //      studentDao.getStudentById(1);

        // test getAllStudents
//        List < Student > students = studentDao.getAllStudents();
//        students.forEach(studentDao - > System.out.println(studentDao.getId()));

        // test deleteStudent
        studentDao.deleteStudent(1);

    }
}
