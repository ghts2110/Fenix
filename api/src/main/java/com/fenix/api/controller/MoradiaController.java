package com.fenix.api.controller;

import com.fenix.api.models.MoradiaModel;
import com.fenix.api.services.MoradiaService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/moradias")
public class MoradiaController {

    @Autowired
    private MoradiaService moradiaService;

    @GetMapping
    public List<MoradiaModel> getAllMoradias() {
        return moradiaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MoradiaModel> getMoradiaById(@PathVariable long id) {
        Optional<MoradiaModel> moradia = moradiaService.findById(id);
        return moradia.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public MoradiaModel createMoradia(@RequestBody @Valid MoradiaModel moradiaModel) {
        return moradiaService.save(moradiaModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoradia(@PathVariable long id) {
        moradiaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
