package com.example.trafficsystem.repository;

import com.example.trafficsystem.entity.Violation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViolationRepository extends JpaRepository<Violation, Long> {
}