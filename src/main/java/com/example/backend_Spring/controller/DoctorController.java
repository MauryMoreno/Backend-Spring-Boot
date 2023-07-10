package com.example.backend_Spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.backend_Spring.model.Doctor;
import com.example.backend_Spring.repository.DoctorRepository;
import com.example.backend_Spring.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private CitaRepository citaRepository;

    @PostMapping("/doctores")
    public ResponseEntity<Doctor> addUsuario(@RequestBody Doctor doctor) {
        try {
            Doctor _doctor =doctorRepository.save(doctor);
            return new ResponseEntity<>(_doctor, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/doctores")
    public ResponseEntity<List<Doctor>> getDoctores() {
        try {            
            List<Doctor> doctores= doctorRepository.findAll();
            return new ResponseEntity<>(doctores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/doctores/{id}")
    public ResponseEntity<String> deleteDoctor(@PathVariable String id) {
        try {
            if (doctorRepository.existsById(id)) {
                doctorRepository.deleteById(id);
                //citaRepository.deleteByDoctorId(id); // Supone que este método existe en tu CitaRepository
                return new ResponseEntity<>("Eliminado correctamete", HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/doctores/especialidad/{especialidad}")
    public ResponseEntity<List<Doctor>> getDoctoresByEspecialidad(@PathVariable String especialidad) {
        try {
            List<Doctor> doctores = doctorRepository.findByEspecialidad(especialidad); // Supone que este método existe en tu DoctorRepository
            return ResponseEntity.ok(doctores);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

}