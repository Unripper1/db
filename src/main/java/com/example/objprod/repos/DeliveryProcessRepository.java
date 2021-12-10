package com.example.objprod.repos;

import com.example.objprod.entities.DeliveryProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeliveryProcessRepository extends JpaRepository<DeliveryProcess, Integer>{
}