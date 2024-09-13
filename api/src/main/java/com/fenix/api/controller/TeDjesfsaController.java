package com.fenix.api.controller;

import com.fenix.api.models.TeDjesfsa;
import com.fenix.api.services.TeDjesfsaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/te-djesfsas")
public class TeDjesfsaController {

    @Autowired
    private TeDjesfsaService teDjesfsaService;

    @GetMapping
    public List<TeDjesfsa> getAllTeDjesfsas() {
        return teDjesfsaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeDjesfsa> getTeDjesfsaById(@PathVariable Long id) {
        Optional<TeDjesfsa> teDjesfsa = teDjesfsaService.findById(id);
        return teDjesfsa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TeDjesfsa createTeDjesfsa(@RequestBody TeDjesfsa teDjesfsa) {
        return teDjesfsaService.save(teDjesfsa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeDjesfsa(@PathVariable Long id) {
        teDjesfsaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
