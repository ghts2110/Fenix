package com.fenix.api.controller;

import com.fenix.api.models.Telefone;
import com.fenix.api.services.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/telefones")
public class TelefoneController {

    @Autowired
    private TelefoneService telefoneService;

    @GetMapping
    public List<Telefone> getAllTelefones() {
        return telefoneService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Telefone> getTelefoneById(@PathVariable long id) {
        Optional<Telefone> telefone = telefoneService.findById(id);
        return telefone.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Telefone createTelefone(@RequestBody Telefone telefone) {
        return telefoneService.save(telefone);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelefone(@PathVariable long id) {
        telefoneService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
