package com.jpa.SpringBootOneToOne.repository;

import com.jpa.SpringBootOneToOne.entity.AadharCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadharCardJpaRepository extends JpaRepository<AadharCard, Long> {
}
