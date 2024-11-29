package com.hospital.gestion_historias.repository;

import com.hospital.gestion_historias.model.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Long> {
    // Método para encontrar una historia clínica por la cédula del paciente
    Optional<HistoriaClinica> findByPacienteCedula(String cedula);
}

