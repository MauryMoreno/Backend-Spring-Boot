package com.example.backend_Spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.backend_Spring.model.Cita;
import com.example.backend_Spring.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CitaController {

    @Autowired
    private CitaRepository repository;

    @PostMapping("/citas")
    public ResponseEntity<Cita> postCita(@RequestBody Cita cita) {
        try {
            Cita _cita =repository.save(cita);
            return new ResponseEntity<>(_cita, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/citas")
    public ResponseEntity<List<Cita>> getCitas() {
        try {            
            List<Cita> citas= repository.findAll();
            return new ResponseEntity<>(citas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}