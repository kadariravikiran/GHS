package com.gnanodaya.notification.repository;

import com.gnanodaya.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {}
