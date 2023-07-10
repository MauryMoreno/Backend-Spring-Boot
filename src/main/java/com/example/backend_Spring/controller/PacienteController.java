package com.example.backend_Spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.backend_Spring.model.Paciente;
import com.example.backend_Spring.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping("/pacientes")
    public ResponseEntity<Paciente> addUsuario(@RequestBody Paciente paciente) {
        try {
            Paciente _paciente =repository.save(paciente);
            return new ResponseEntity<>(_paciente, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/pacientes")
    public ResponseEntity<List<Paciente>> getPacientes() {
        try {            
            List<Paciente> pacientes= repository.findAll();
            return new ResponseEntity<>(pacientes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @GetMapping("/pacientes/cedula/{cedula}")
    public Paciente getPacienteByCedula(@PathVariable String cedula) {
        return repository.findByCedula(cedula);
    }

}