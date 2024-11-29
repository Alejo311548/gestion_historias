package com.hospital.gestion_historias.repository;


import com.hospital.gestion_historias.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
