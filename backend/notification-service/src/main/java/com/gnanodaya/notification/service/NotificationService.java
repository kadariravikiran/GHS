package com.gnanodaya.notification.service;

import com.gnanodaya.notification.dto.NotificationRequest;
import com.gnanodaya.notification.entity.Notification;
import com.gnanodaya.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository=repository;
    }

    public List<Notification> findAll() { return repository.findAll(); }

    public Notification findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Notification not found: " + id));
    }

    public Notification create(NotificationRequest request) {
        Notification item=new Notification();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Notification update(Long id, NotificationRequest request) {
        Notification item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
