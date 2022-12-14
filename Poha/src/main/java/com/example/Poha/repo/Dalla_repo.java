package com.example.Poha.repo;

import com.example.Poha.model.Dalla_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dalla_repo extends JpaRepository<Dalla_model,Long> {
}
