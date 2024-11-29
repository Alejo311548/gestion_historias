package com.hospital.gestion_historias.graphql;



import com.hospital.gestion_historias.model.HistoriaClinica;
import com.hospital.gestion_historias.service.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver {

    @Autowired
    private HistoriaClinicaService historiaClinicaService;

    public HistoriaClinica obtenerHistoriaPorCedula(String cedula) {
        return historiaClinicaService.obtenerPorCedula(cedula)
                .orElseThrow(() -> new RuntimeException("Historia no encontrada"));
    }
}
