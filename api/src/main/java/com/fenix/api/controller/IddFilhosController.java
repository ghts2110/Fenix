package com.fenix.api.controller;

import com.fenix.api.models.IddFilhos;
import com.fenix.api.services.IddFilhosService;
import com.fenix.api.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/iddFilhos")
public class IddFilhosController {

    @Autowired
    private IddFilhosService iddFilhosService;

    @GetMapping
    public ResponseEntity<List<IddFilhos>> getAllIddFilhos() {
        return ResponseEntity.ok(iddFilhosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<IddFilhos> getIddFilhosById(@PathVariable Long id) {
        try {
            IddFilhos iddFilhos = iddFilhosService.findById(id);
            return ResponseEntity.ok(iddFilhos);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<IddFilhos> createIddFilhos(@RequestBody IddFilhos iddFilhos) {
        try {
            IddFilhos savedIddFilhos = iddFilhosService.create(iddFilhos);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedIddFilhos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<IddFilhos> updateIddFilhos(@PathVariable Long id, @RequestBody IddFilhos iddFilhos) {
        try {
            IddFilhos updatedIddFilhos = iddFilhosService.update(id, iddFilhos);
            return ResponseEntity.ok(updatedIddFilhos);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIddFilhos(@PathVariable Long id) {
        try {
            iddFilhosService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
