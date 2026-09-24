package com.gnanodaya.exam.service;

import com.gnanodaya.exam.dto.ExamRequest;
import com.gnanodaya.exam.entity.Exam;
import com.gnanodaya.exam.repository.ExamRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExamService {
    private final ExamRepository repository;

    public ExamService(ExamRepository repository) {
        this.repository=repository;
    }

    public List<Exam> findAll() { return repository.findAll(); }

    public Exam findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Exam not found: " + id));
    }

    public Exam create(ExamRequest request) {
        Exam item=new Exam();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Exam update(Long id, ExamRequest request) {
        Exam item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
