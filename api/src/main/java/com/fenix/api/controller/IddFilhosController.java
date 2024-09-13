package com.fenix.api.controller;

import com.fenix.api.models.IddFilhos;
import com.fenix.api.services.IddFilhosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/idd-filhos")
public class IddFilhosController {

    @Autowired
    private IddFilhosService iddFilhosService;

    @GetMapping
    public List<IddFilhos> getAllIddFilhos() {
        return iddFilhosService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<IddFilhos> getIddFilhosById(@PathVariable long id) {
        Optional<IddFilhos> iddFilhos = iddFilhosService.findById(id);
        return iddFilhos.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public IddFilhos createIddFilhos(@RequestBody IddFilhos iddFilhos) {
        return iddFilhosService.save(iddFilhos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIddFilhos(@PathVariable long id) {
        iddFilhosService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
