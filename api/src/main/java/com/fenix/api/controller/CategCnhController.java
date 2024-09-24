package com.fenix.api.controller;

import com.fenix.api.models.CategCnh;
import com.fenix.api.services.CategCnhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categ-cnhs")
public class CategCnhController {

    @Autowired
    private CategCnhService categCnhService;

    @GetMapping
    public List<CategCnh> getAllCategCnhs() {
        return categCnhService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategCnh> getCategCnhById(@PathVariable long id) {
        Optional<CategCnh> categCnh = categCnhService.findById(id);
        return categCnh.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public CategCnh createCategCnh(@RequestBody CategCnh categCnh) {
        return categCnhService.save(categCnh);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategCnh(@PathVariable long id) {
        categCnhService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
