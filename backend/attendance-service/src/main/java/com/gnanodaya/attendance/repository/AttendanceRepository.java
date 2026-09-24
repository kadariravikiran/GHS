package com.gnanodaya.attendance.repository;

import com.gnanodaya.attendance.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {}
