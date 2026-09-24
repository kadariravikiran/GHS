package com.gnanodaya.gallery.service;

import com.gnanodaya.gallery.dto.GalleryRequest;
import com.gnanodaya.gallery.entity.Gallery;
import com.gnanodaya.gallery.repository.GalleryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GalleryService {
    private final GalleryRepository repository;

    public GalleryService(GalleryRepository repository) {
        this.repository=repository;
    }

    public List<Gallery> findAll() { return repository.findAll(); }

    public Gallery findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Gallery not found: " + id));
    }

    public Gallery create(GalleryRequest request) {
        Gallery item=new Gallery();
        item.setName(request.getName());
        return repository.save(item);
    }

    public Gallery update(Long id, GalleryRequest request) {
        Gallery item=findById(id);
        item.setName(request.getName());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
