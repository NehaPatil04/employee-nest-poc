package com.one.employeenestpoc.employeenestpoc.repository;

import com.one.employeenestpoc.employeenestpoc.entity.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeavesRepository extends JpaRepository<Leaves,Integer> {
}
