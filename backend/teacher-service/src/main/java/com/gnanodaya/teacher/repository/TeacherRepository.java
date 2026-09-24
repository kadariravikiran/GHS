package com.gnanodaya.teacher.repository;

import com.gnanodaya.teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {}
