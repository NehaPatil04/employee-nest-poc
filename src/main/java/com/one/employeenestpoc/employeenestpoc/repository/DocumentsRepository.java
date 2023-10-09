package com.one.employeenestpoc.employeenestpoc.repository;

import com.one.employeenestpoc.employeenestpoc.entity.Documents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsRepository extends JpaRepository<Documents,Integer> {
}
