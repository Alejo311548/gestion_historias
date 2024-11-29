package com.hospital.gestion_historias.service;



import com.hospital.gestion_historias.model.HistoriaClinica;
import com.hospital.gestion_historias.repository.HistoriaClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HistoriaClinicaService {

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    public Optional<HistoriaClinica> obtenerPorCedula(String cedula) {
        return historiaClinicaRepository.findByPacienteCedula(cedula);
    }

    public HistoriaClinica guardar(HistoriaClinica historiaClinica) {
        return historiaClinicaRepository.save(historiaClinica);
    }
}
