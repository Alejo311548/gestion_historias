package com.hospital.gestion_historias.repository;




import com.hospital.gestion_historias.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
