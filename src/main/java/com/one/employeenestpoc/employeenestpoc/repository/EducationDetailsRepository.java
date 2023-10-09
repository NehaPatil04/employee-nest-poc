package com.one.employeenestpoc.employeenestpoc.repository;

import com.one.employeenestpoc.employeenestpoc.entity.EducationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDetailsRepository extends JpaRepository<EducationDetails,Integer> {
}
