package com.one.employeenestpoc.employeenestpoc.repository;

import com.one.employeenestpoc.employeenestpoc.entity.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInfoRepository extends JpaRepository<PersonalInformation,Integer> {
}
