package com.fenix.api.controller;

import com.fenix.api.models.ExpProf;
import com.fenix.api.services.ExpProfService;
import com.fenix.api.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expProf")
public class ExpProfController {

    @Autowired
    private ExpProfService expProfService;

    @GetMapping
    public ResponseEntity<List<ExpProf>> getAllExpProf() {
        return ResponseEntity.ok(expProfService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpProf> getExpProfById(@PathVariable Long id) {
        try {
            ExpProf expProf = expProfService.findById(id);
            return ResponseEntity.ok(expProf);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<ExpProf> createExpProf(@RequestBody ExpProf expProf) {
        try {
            ExpProf savedExpProf = expProfService.create(expProf);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedExpProf);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExpProf> updateExpProf(@PathVariable Long id, @RequestBody ExpProf expProf) {
        try {
            ExpProf updatedExpProf = expProfService.update(id, expProf);
            return ResponseEntity.ok(updatedExpProf);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpProf(@PathVariable Long id) {
        try {
            expProfService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
