package com.boot.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.doclogin.entity.Medicine;
import com.boot.doclogin.controller.MedicineController;


@Repository
public interface MedicineRepository  extends JpaRepository<Medicine, Long>{

}
