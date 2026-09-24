package com.gnanodaya.homework.service;

import com.gnanodaya.homework.dto.HomeworkRequest;
import com.gnanodaya.homework.entity.Homework;
import com.gnanodaya.homework.repository.HomeworkRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HomeworkService {
    private final HomeworkRepository repository;

    public HomeworkService(HomeworkRepository repository) {
        this.repository=repository;
    }

    public List<Homework> findAll() { return repository.findAll(); }

    public Homework findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Homework not found: " + id));
    }

    public Homework create(HomeworkRequest request) {
        Homework item=new Homework();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Homework update(Long id, HomeworkRequest request) {
        Homework item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
