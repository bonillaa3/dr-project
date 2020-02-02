package com.project.drprofit.repository;

import com.project.drprofit.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository extends JpaRepository<Resource, Long>{
}
