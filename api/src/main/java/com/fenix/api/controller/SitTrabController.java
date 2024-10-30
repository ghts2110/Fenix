package com.fenix.api.controller;

import com.fenix.api.models.SitTrabModel;
import com.fenix.api.services.SitTrabService;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sittrab")
public class SitTrabController {

    @Autowired
    private SitTrabService sitTrabService;

    @GetMapping
    public ResponseEntity<List<SitTrabModel>> getAllSitTrab() {
        return ResponseEntity.ok(sitTrabService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SitTrabModel> getSitTrabById(@PathVariable Long id) {
        try {
            SitTrabModel sitTrab = sitTrabService.findById(id);
            return ResponseEntity.ok(sitTrab);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<SitTrabModel> createSitTrab(@RequestBody SitTrabModel sitTrab) {
        try {
            SitTrabModel savedSitTrab = sitTrabService.create(sitTrab);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedSitTrab);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<SitTrabModel> updateSitTrab(@PathVariable Long id, @RequestBody SitTrabModel sitTrab) {
        try {
            SitTrabModel updatedSitTrab = sitTrabService.update(id, sitTrab);
            return ResponseEntity.ok(updatedSitTrab);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSitTrab(@PathVariable Long id) {
        try {
            sitTrabService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
