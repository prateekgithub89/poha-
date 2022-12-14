package com.example.Poha.repo;

import com.example.Poha.model.Karamchari_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Karamchari_repo extends JpaRepository<Karamchari_model,Long> {



}
