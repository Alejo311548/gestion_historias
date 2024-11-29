package com.hospital.gestion_historias.graphql;

import com.hospital.gestion_historias.model.*;
import com.hospital.gestion_historias.service.*;
import com.hospital.gestion_historias.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MutationResolver {

    @Autowired
    private HistoriaClinicaService historiaClinicaService;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    public HistoriaClinica registrarHistoria(
            String nombrePaciente, String apellidoPaciente, String cedulaPaciente, int edad, String genero,
            String nombreDoctor, String cedulaProfesional, String especialidad,
            String motivoConsulta, String diagnostico, String tratamiento, String fecha) {

        // Crear y guardar paciente
        Paciente paciente = pacienteRepository.save(
                new Paciente(null, nombrePaciente, apellidoPaciente, cedulaPaciente, edad, genero));

        // Crear y guardar doctor
        Doctor doctor = doctorRepository.save(
                new Doctor(null, nombreDoctor, cedulaProfesional, especialidad));

        // Crear y guardar historia clínica
        HistoriaClinica historia = new HistoriaClinica();
        historia.setPaciente(paciente);
        historia.setDoctor(doctor);
        historia.setMotivoConsulta(motivoConsulta);
        historia.setDiagnostico(diagnostico);
        historia.setTratamiento(tratamiento);
        historia.setFecha(LocalDate.parse(fecha));

        return historiaClinicaService.guardar(historia);
    }
}
