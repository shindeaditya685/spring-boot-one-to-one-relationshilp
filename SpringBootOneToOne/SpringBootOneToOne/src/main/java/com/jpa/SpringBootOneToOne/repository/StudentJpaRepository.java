package com.jpa.SpringBootOneToOne.repository;

import com.jpa.SpringBootOneToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Long> {
}
