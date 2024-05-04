package com.udintsev.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udintsev.backend.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}
