package com.fenix.api.controller;

import com.fenix.api.models.QDef;
import com.fenix.api.services.QDefService;
import com.fenix.api.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/qdef")
public class QDefController {

    @Autowired
    private QDefService qDefService;

    @GetMapping
    public ResponseEntity<List<QDef>> getAllQDef() {
        return ResponseEntity.ok(qDefService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<QDef> getQDefById(@PathVariable Long id) {
        try {
            QDef qDef = qDefService.findById(id);
            return ResponseEntity.ok(qDef);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<QDef> createQDef(@RequestBody QDef qDef) {
        try {
            QDef savedQDef = qDefService.create(qDef);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedQDef);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<QDef> updateQDef(@PathVariable Long id, @RequestBody QDef qDef) {
        try {
            QDef updatedQDef = qDefService.update(id, qDef);
            return ResponseEntity.ok(updatedQDef);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQDef(@PathVariable Long id) {
        try {
            qDefService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
