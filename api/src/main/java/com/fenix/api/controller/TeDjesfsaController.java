package com.fenix.api.controller;

import com.fenix.api.models.TeDjesfsa;
import com.fenix.api.services.TeDjesfsaService;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tedjesfsa")
public class TeDjesfsaController {

    @Autowired
    private TeDjesfsaService teDjesfsaService;

    @GetMapping
    public ResponseEntity<List<TeDjesfsa>> getAllTeDjesfsa() {
        return ResponseEntity.ok(teDjesfsaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeDjesfsa> getTeDjesfsaById(@PathVariable Long id) {
        try {
            TeDjesfsa teDjesfsa = teDjesfsaService.findById(id);
            return ResponseEntity.ok(teDjesfsa);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<TeDjesfsa> createTeDjesfsa(@RequestBody TeDjesfsa teDjesfsa) {
        try {
            TeDjesfsa savedTeDjesfsa = teDjesfsaService.create(teDjesfsa);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedTeDjesfsa);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeDjesfsa> updateTeDjesfsa(@PathVariable Long id, @RequestBody TeDjesfsa teDjesfsa) {
        try {
            TeDjesfsa updatedTeDjesfsa = teDjesfsaService.update(id, teDjesfsa);
            return ResponseEntity.ok(updatedTeDjesfsa);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeDjesfsa(@PathVariable Long id) {
        try {
            teDjesfsaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
