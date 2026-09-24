package com.gnanodaya.announcement.repository;

import com.gnanodaya.announcement.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {}
