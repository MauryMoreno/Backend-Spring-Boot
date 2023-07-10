package com.example.backend_Spring.repository;
import com.example.backend_Spring.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
    List<Doctor> findByEspecialidad(String especialidad);
}
