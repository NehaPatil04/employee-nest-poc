package com.one.employeenestpoc.employeenestpoc.repository;

import com.one.employeenestpoc.employeenestpoc.entity.EmploymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentDetailsRepository extends JpaRepository<EmploymentDetails,Integer> {
}
