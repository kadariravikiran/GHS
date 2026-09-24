package com.gnanodaya.teacher.service;

import com.gnanodaya.teacher.dto.TeacherRequest;
import com.gnanodaya.teacher.entity.Teacher;
import com.gnanodaya.teacher.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService {
    private final TeacherRepository repository;

    public TeacherService(TeacherRepository repository) {
        this.repository=repository;
    }

    public List<Teacher> findAll() { return repository.findAll(); }

    public Teacher findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Teacher not found: " + id));
    }

    public Teacher create(TeacherRequest request) {
        Teacher item=new Teacher();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Teacher update(Long id, TeacherRequest request) {
        Teacher item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
