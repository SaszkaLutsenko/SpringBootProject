package oleksandrlutsenko.springbootproject.service;

import oleksandrlutsenko.springbootproject.model.Student;

import java.util.List;


public interface StudentService {

    List<Student> findAllStudents();

    Student saveStudents(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);


}
