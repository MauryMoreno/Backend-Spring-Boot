package com.example.backend_Spring.repository;
import com.example.backend_Spring.model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, String> {
    Paciente findByCedula(String cedula);
}
