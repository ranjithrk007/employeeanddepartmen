package com.auxo.springboot.repository;
import com.auxo.springboot.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}