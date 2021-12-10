package com.example.objprod.repos;

import com.example.objprod.entities.ManufacturingProcess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturingProcessRepository extends JpaRepository<ManufacturingProcess, Integer> {
}