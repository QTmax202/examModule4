package com.example.module4_practice_exam.repository;

import com.example.module4_practice_exam.model.National;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INationalRepository extends JpaRepository<National, Long> {
}