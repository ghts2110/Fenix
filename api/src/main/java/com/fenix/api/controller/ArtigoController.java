package com.fenix.api.controller;

import com.fenix.api.models.Artigo;
import com.fenix.api.services.ArtigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artigos")
public class ArtigoController {

    @Autowired
    private ArtigoService artigoService;

    @GetMapping
    public List<Artigo> getAllArtigos() {
        return artigoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artigo> getArtigoById(@PathVariable long id) {
        Optional<Artigo> artigo = artigoService.findById(id);
        return artigo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Artigo createArtigo(@RequestBody Artigo artigo) {
        return artigoService.save(artigo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtigo(@PathVariable long id) {
        artigoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
