package com.example.backend_Spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "citas")
public class Cita {
    @Id
    @JsonProperty("_id")
    private String id;
    private String doctor;
    private String paciente;
    private Date fecha;

    public String getId() {
        return id;
    }    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getDoctor() {
        return doctor;
    }
    
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
    public String getPaciente() {
        return paciente;
    }
    
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
}