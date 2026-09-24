package com.gnanodaya.gallery.repository;

import com.gnanodaya.gallery.entity.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryRepository extends JpaRepository<Gallery, Long> {}
