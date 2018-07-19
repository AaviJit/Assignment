package com.avijit.stock.dbservice.repository;

import com.avijit.stock.dbservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
