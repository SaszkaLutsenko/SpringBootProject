package oleksandrlutsenko.springbootproject.impl;

import lombok.AllArgsConstructor;
import oleksandrlutsenko.springbootproject.model.Student;
import oleksandrlutsenko.springbootproject.service.StudentService;
import org.springframework.stereotype.Service;
import oleksandrlutsenko.springbootproject.repository.InMemoryStudentsData;


import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentsData repository;

    @Override
    public List<Student> findAllStudents() {
      return repository.findAllStudents();
    }

    @Override
    public Student saveStudents(Student student) {
        return repository.saveStudents(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }


}
