package com.gnanodaya.student.service;

import com.gnanodaya.student.dto.StudentRequest;
import com.gnanodaya.student.entity.Student;
import com.gnanodaya.student.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository=repository;
    }

    public List<Student> findAll() { return repository.findAll(); }

    public Student findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Student not found: " + id));
    }

    public Student create(StudentRequest request) {
        Student item=new Student();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Student update(Long id, StudentRequest request) {
        Student item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
