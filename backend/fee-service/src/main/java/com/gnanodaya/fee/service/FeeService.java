package com.gnanodaya.fee.service;

import com.gnanodaya.fee.dto.FeeRequest;
import com.gnanodaya.fee.entity.Fee;
import com.gnanodaya.fee.repository.FeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeeService {
    private final FeeRepository repository;

    public FeeService(FeeRepository repository) {
        this.repository=repository;
    }

    public List<Fee> findAll() { return repository.findAll(); }

    public Fee findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Fee not found: " + id));
    }

    public Fee create(FeeRequest request) {
        Fee item=new Fee();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Fee update(Long id, FeeRequest request) {
        Fee item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
