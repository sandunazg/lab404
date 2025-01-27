package com.example.hospitalDb.repository;

import com.example.hospitalDb.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
