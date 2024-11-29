package com.hospital.gestion_historias.model;

import jakarta.persistence.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String cedulaProfesional;
    private String especialidad;

    // Constructor vacío (sin parámetros)
    public Doctor() { }

    // Constructor con todos los parámetros
    public Doctor(Long id, String nombre, String cedulaProfesional, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.cedulaProfesional = cedulaProfesional;
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método toString (opcional, pero útil para depuración)
    @Override
    public String toString() {
        return "Doctor{id=" + id + ", nombre='" + nombre + "', cedulaProfesional='" + cedulaProfesional + "', especialidad='" + especialidad + "'}";
    }
}
