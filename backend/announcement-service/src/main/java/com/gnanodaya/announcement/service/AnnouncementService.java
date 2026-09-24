package com.gnanodaya.announcement.service;

import com.gnanodaya.announcement.dto.AnnouncementRequest;
import com.gnanodaya.announcement.entity.Announcement;
import com.gnanodaya.announcement.repository.AnnouncementRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnnouncementService {
    private final AnnouncementRepository repository;

    public AnnouncementService(AnnouncementRepository repository) {
        this.repository=repository;
    }

    public List<Announcement> findAll() { return repository.findAll(); }

    public Announcement findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Announcement not found: " + id));
    }

    public Announcement create(AnnouncementRequest request) {
        Announcement item=new Announcement();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Announcement update(Long id, AnnouncementRequest request) {
        Announcement item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
