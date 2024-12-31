package com.boot.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.boot.entity.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
