package com.fenix.api.controller;

import com.fenix.api.models.Telefone;
import com.fenix.api.services.TelefoneService;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/telefone")
public class TelefoneController {

    @Autowired
    private TelefoneService telefoneService;

    @GetMapping
    public ResponseEntity<List<Telefone>> getAllTelefone() {
        return ResponseEntity.ok(telefoneService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Telefone> getTelefoneById(@PathVariable Long id) {
        try {
            Telefone telefone = telefoneService.findById(id);
            return ResponseEntity.ok(telefone);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<Telefone> createTelefone(@RequestBody Telefone telefone) {
        try {
            Telefone savedTelefone = telefoneService.create(telefone);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedTelefone);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Telefone> updateTelefone(@PathVariable Long id, @RequestBody Telefone telefone) {
        try {
            Telefone updatedTelefone = telefoneService.update(id, telefone);
            return ResponseEntity.ok(updatedTelefone);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelefone(@PathVariable Long id) {
        try {
            telefoneService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
