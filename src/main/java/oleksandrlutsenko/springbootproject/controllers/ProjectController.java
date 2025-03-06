package oleksandrlutsenko.springbootproject.controllers;

import lombok.AllArgsConstructor;
import oleksandrlutsenko.springbootproject.model.Student;
import oleksandrlutsenko.springbootproject.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor

public class ProjectController {

    private final StudentService service;
    @GetMapping()
    public List<Student> findAllStudents(){
        // todo
        return service.findAllStudents();
    }

    @PostMapping("save_student")
    public String saveStudents(@RequestBody Student student){
        service.saveStudents(student);
        return "student sucssefuly saved";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable("email") String email) {
        service.deleteStudent(email);
    }

}
