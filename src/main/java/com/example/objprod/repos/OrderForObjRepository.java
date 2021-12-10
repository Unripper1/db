package com.example.objprod.repos;

import com.example.objprod.entities.OrderForObj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderForObjRepository extends JpaRepository<OrderForObj, Integer> {
}