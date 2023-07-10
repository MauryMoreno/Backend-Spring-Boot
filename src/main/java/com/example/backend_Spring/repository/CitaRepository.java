package com.example.backend_Spring.repository;
import com.example.backend_Spring.model.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitaRepository extends MongoRepository<Cita, String> {
}
