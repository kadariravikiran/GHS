package com.gnanodaya.homework.repository;

import com.gnanodaya.homework.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkRepository extends JpaRepository<Homework, Long> {}
