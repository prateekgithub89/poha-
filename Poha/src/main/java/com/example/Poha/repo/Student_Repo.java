package com.example.Poha.repo;

import com.example.Poha.model.Student_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_Repo extends JpaRepository<Student_Model,Long> {
}
