package com.example.objprod.repos;

import com.example.objprod.entities.Workplace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkplaceRepository extends JpaRepository<Workplace, Integer> {
}