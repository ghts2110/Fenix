package com.fenix.api.controller;

import com.fenix.api.models.Artigo;
import com.fenix.api.services.ArtigoService;
import com.fenix.api.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artigos")
public class ArtigoController {

    @Autowired
    private ArtigoService artigoService;

    @GetMapping
    public ResponseEntity<List<Artigo>> getAllArtigos() {
        return ResponseEntity.ok(artigoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artigo> getArtigoById(@PathVariable Long id) {
        try {
            Artigo artigo = artigoService.findById(id);
            return ResponseEntity.ok(artigo);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<Artigo> createArtigo(@RequestBody Artigo artigo) {
        try {
            Artigo savedArtigo = artigoService.create(artigo);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedArtigo);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Artigo> updateArtigo(@PathVariable Long id, @RequestBody Artigo artigo) {
        try {
            Artigo updatedArtigo = artigoService.update(id, artigo);
            return ResponseEntity.ok(updatedArtigo);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtigo(@PathVariable Long id) {
        try {
            artigoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
