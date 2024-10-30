package com.fenix.api.controller;

import com.fenix.api.models.MoradiaModel;
import com.fenix.api.services.MoradiaService;
import com.fenix.api.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/moradia")
public class MoradiaController {

    @Autowired
    private MoradiaService moradiaService;

    @GetMapping
    public ResponseEntity<List<MoradiaModel>> getAllMoradia() {
        return ResponseEntity.ok(moradiaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MoradiaModel> getMoradiaById(@PathVariable Long id) {
        try {
            MoradiaModel moradiaModel = moradiaService.findById(id);
            return ResponseEntity.ok(moradiaModel);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<MoradiaModel> createMoradia(@RequestBody MoradiaModel moradiaModel) {
        try {
            MoradiaModel savedMoradia = moradiaService.create(moradiaModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedMoradia);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<MoradiaModel> updateMoradia(@PathVariable Long id, @RequestBody MoradiaModel moradiaModel) {
        try {
            MoradiaModel updatedMoradia = moradiaService.update(id, moradiaModel);
            return ResponseEntity.ok(updatedMoradia);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoradia(@PathVariable Long id) {
        try {
            moradiaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
