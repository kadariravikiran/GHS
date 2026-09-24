package com.gnanodaya.attendance.service;

import com.gnanodaya.attendance.dto.AttendanceRequest;
import com.gnanodaya.attendance.entity.Attendance;
import com.gnanodaya.attendance.repository.AttendanceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AttendanceService {
    private final AttendanceRepository repository;

    public AttendanceService(AttendanceRepository repository) {
        this.repository=repository;
    }

    public List<Attendance> findAll() { return repository.findAll(); }

    public Attendance findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Attendance not found: " + id));
    }

    public Attendance create(AttendanceRequest request) {
        Attendance item=new Attendance();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Attendance update(Long id, AttendanceRequest request) {
        Attendance item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
